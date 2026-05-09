-- create database  cash_test  ;  ; 
-- \c  cash_test  ;

CREATE TABLE entity_type (
    id SERIAL PRIMARY KEY,
    code VARCHAR(40) NOT NULL UNIQUE,
    description TEXT
);
 
CREATE TABLE roles (
    id SERIAL PRIMARY KEY,
    code VARCHAR(40) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL UNIQUE ,
    description TEXT
);
 
CREATE TABLE status_generalized(
    id SERIAL PRIMARY KEY,
    entity_type_id INT NOT NULL REFERENCES entity_type(id),

    code VARCHAR(40) NOT NULL,     -- ex: PENDING, CONFIRMED
    label VARCHAR(100),            -- ex: En attente, Confirme
    description TEXT,

    status_order INT NOT NULL,     -- ordre logique

    is_final BOOLEAN DEFAULT FALSE,
    is_active BOOLEAN DEFAULT TRUE,

    created_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE (entity_type_id, code),
    UNIQUE (entity_type_id, status_order)
);

-- Table des opérateurs
CREATE TABLE operateurs (
    id SERIAL PRIMARY KEY,
    code TEXT NOT NULL UNIQUE, -- 'MVOLA', 'ORANGE', 'AIRTEL'
    nom TEXT NOT NULL,
    prefixe_code TEXT, -- ex: 034 pour Mvola
    couleur_theme TEXT DEFAULT '#007bff',
    logo_url TEXT,
    commission_retrait DECIMAL(5,2) DEFAULT 0.5,
    commission_depot DECIMAL(5,2) DEFAULT 0.3,
    commission_transfert DECIMAL(5,2) DEFAULT 0.4,
    actif BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP
);



-- abonnement mensuel 
CREATE TABLE company (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE,
    
    adresse TEXT,
    ville VARCHAR(100),
    pays VARCHAR(100),

    contact_email VARCHAR(100),
    contact_phone VARCHAR(20),

    logo_url TEXT,

    actif BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    created_by INTEGER , 
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

create table operateurs_company(
    id SERIAL PRIMARY KEY,
    company_id int REFERENCES company(id) , 
    operateur_id int REFERENCES operateurs(id) , 
    numero_compte TEXT ,

    is_actif BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP
) ;


CREATE TABLE abonnements (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(50) NOT NULL, -- ex: BASIC, PRO, PREMIUM
    prix DECIMAL(10,2) NOT NULL,
    duree_jours INTEGER NOT NULL, -- ex: 30 jours
    description TEXT,
    actif BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMPTZ DEFAULT NOW() , 
    updated_at TIMESTAMPTZ DEFAULT NOW()
);


CREATE TABLE utilisateurs (
    id SERIAL PRIMARY KEY,
    company_id  int REFERENCES company(id) ,
    role_id INT REFERENCES roles(id) , 

    matricule TEXT NOT NULL UNIQUE,
    name TEXT NOT NULL,
    prenom TEXT NOT NULL,
    identifiant TEXT NOT NULL UNIQUE,
    mot_de_passe_hash TEXT NOT NULL ,
    peut_ouvrir_caisse BOOLEAN DEFAULT FALSE,
    peut_fermer_caisse BOOLEAN DEFAULT FALSE,
    peut_valider_transaction BOOLEAN DEFAULT FALSE,
    peut_voir_rapports BOOLEAN DEFAULT FALSE,
    peut_gerer_utilisateurs BOOLEAN DEFAULT FALSE,
    actif BOOLEAN DEFAULT TRUE,
    date_derniere_connexion TIMESTAMP,
    tentatives_connexion INT DEFAULT 0,
    bloque_jusqu TIMESTAMPTZ , 
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    cree_par INTEGER REFERENCES utilisateurs(id)
);

CREATE TABLE company_abonnements (
    id SERIAL PRIMARY KEY,

    company_id INTEGER NOT NULL REFERENCES company(id),
    abonnement_id INTEGER NOT NULL REFERENCES abonnements(id),

    date_debut TIMESTAMPTZ DEFAULT NOW(),
    date_fin TIMESTAMPTZ NOT NULL,

    statut INT NOT NULL REFERENCES status_generalized(id),

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(), 

    CONSTRAINT check_dates CHECK (date_fin > date_debut)
);

CREATE TABLE paiements_abonnements (
    id SERIAL PRIMARY KEY,
    company_abonnement_id INTEGER NOT NULL REFERENCES company_abonnements(id),
    montant DECIMAL(10,2) NOT NULL,
    date_paiement TIMESTAMPTZ DEFAULT NOW()
);


CREATE TABLE type_operation (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) UNIQUE NOT NULL
    -- ex: 'retrait', 'envoi_sans_frais', 'envoi_avec_frais'
);

CREATE TABLE zone (
    id SERIAL PRIMARY KEY,
    code VARCHAR(50) UNIQUE NOT NULL
    -- ex: 'tana', 'province'
);

CREATE TABLE grille_tarifaire (
    id SERIAL PRIMARY KEY,

    type_operation_id  INTEGER  NOT NULL REFERENCES type_operation(id),
    operateur_id INTEGER NOT NULL REFERENCES operateurs(id),

    montant_min NUMERIC(15,2) NOT NULL,
    montant_max NUMERIC(15,2), -- NULL = infini

    created_at TIMESTAMP DEFAULT now() , 
    CHECK (montant_min < montant_max OR montant_max IS NULL)
);

CREATE INDEX idx_grille_lookup
ON grille_tarifaire (type_operation_id, montant_min, montant_max);


-- RG :  unique par company si modification   
CREATE TABLE frais (
    id SERIAL PRIMARY KEY,
    company_id int REFERENCES company(id) , -- null company par defaut 
    grille_id INTEGER  NOT NULL REFERENCES grille_tarifaire(id),

    zone_id INTEGER REFERENCES zone(id), -- NULL pour retrait

    montant NUMERIC(15,2) NOT NULL 
);

CREATE UNIQUE INDEX uq_frais
ON frais (
    grille_id,
    COALESCE(company_id, 0),
    COALESCE(zone_id, 0)
);

-- Table des dépenses types
CREATE TABLE type_depenses (
    id SERIAL PRIMARY KEY,
    code TEXT NOT NULL UNIQUE,
    nom TEXT NOT NULL,
    categorie TEXT CHECK(categorie IN ('VARIABLE', 'FIXE', 'FRAIS_SERVICE')),
    frequence TEXT CHECK(frequence IN ('JOURNALIER', 'MENSUEL', 'ANNUEL', 'PONCTUEL')),
    priorite INTEGER DEFAULT 5,
    actif BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP
);

-- Table des taux de change (si multi-devises)
CREATE TABLE taux_change (
    id SERIAL PRIMARY KEY,
    devise_source TEXT NOT NULL,
    devise_cible TEXT NOT NULL,
    taux DECIMAL(10,4) NOT NULL,
    date_application DATE NOT NULL,
    actif BOOLEAN DEFAULT TRUE,
    UNIQUE(devise_source, devise_cible, date_application)
);


