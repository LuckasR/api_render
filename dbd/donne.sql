

-- Inona pory n hirarhiny ny hamaniko anzay ataony olona any fa alao zah hifantoka am tanjoko 


insert into entity_type (code, description) values
('company_abonnements', 'Statuts pour les abonnements des entreprises');

insert into status_generalized (entity_type_id, code, label, status_order) values
(1, 'ACTIF', 'Abonnement en cours', 1),
(1, 'EXPIRE', 'Abonnement terminé', 2),
(1, 'FUTUR', 'Abonnement payé mais pas encore commencé', 3),
(1, 'ANNULE', 'Abonnement annulé', 4),
(1, 'SUSPENDU', 'Abonnement bloqué (ex: non paiement, fraude)', 5);


INSERT INTO roles (code, name, description) VALUES
('ADMIN', 'Administrateur', 'Acces complet'),
('GERANT', 'Gerant', 'Gestion des operations'),
('AGENT', 'Agent', 'Execution des operations');


-- UTILISATEUR

INSERT INTO operateurs (code, nom, couleur_theme) VALUES
('MVOLA', 'Mvola', '#ff6600'),
('ORANGE', 'Orange Money', '#ff9900'),
('AIRTEL', 'Airtel Money', '#ff0000');

INSERT INTO type_depenses (code, nom, categorie, frequence) VALUES
('LOYER', 'Loyer', 'FIXE', 'MENSUEL'),
('INTERNET', 'Internet', 'FIXE', 'MENSUEL'),
('ELECTRICITE', 'Electricite', 'VARIABLE', 'MENSUEL'),
('FRAIS_MVOLA', 'Frais Mvola', 'FRAIS_SERVICE', 'PONCTUEL');

INSERT INTO taux_change (devise_source, devise_cible, taux, date_application) VALUES
('MGA', 'EUR', 0.00020, '2026-01-01'),
('EUR', 'MGA', 5000, '2026-01-01');


INSERT INTO company (name, adresse, ville, pays, contact_email, contact_phone)
VALUES
('CashPoint Tana', 'Analakely', 'Antananarivo', 'Madagascar', 'contact@cp-tana.mg', '0340000000'),
('CashPoint Majunga', 'Centre ville', 'Mahajanga', 'Madagascar', 'contact@cp-majunga.mg', '0320000000');

INSERT INTO abonnements (nom, prix, duree_jours, description) VALUES
('BASIC', 50000, 30, 'Offre de base'),
('PRO', 100000, 30, 'Offre professionnelle'),
('PREMIUM', 200000, 30, 'Offre premium avec toutes les fonctionnalites');

-- Admin principal
INSERT INTO utilisateurs (
    company_id, role_id, matricule, name, prenom, identifiant, mot_de_passe_hash,
    peut_ouvrir_caisse, peut_fermer_caisse, peut_valider_transaction, peut_voir_rapports, peut_gerer_utilisateurs
)
VALUES (
    1, 1, 'MAT001', 'Rakoto', 'Jean', 'admin', 'hash_admin',
    TRUE, TRUE, TRUE, TRUE, TRUE
);

-- Autres utilisateurs
INSERT INTO utilisateurs (
    company_id, role_id, matricule, name, prenom, identifiant, mot_de_passe_hash,
    peut_ouvrir_caisse, peut_valider_transaction, cree_par
)
VALUES
(1, 2, 'MAT002', 'Rabe', 'Paul', 'gerant1', 'hash_gerant', TRUE, TRUE, 1),
(1, 3, 'MAT003', 'Rasoanaivo', 'Marie', 'agent1', 'hash_agent', FALSE, FALSE, 1),
(2, 2, 'MAT004', 'Rakoto', 'Luc', 'gerant2', 'hash_gerant2', TRUE, TRUE, 1); 







 
 
 INSERT INTO type_operation (code) VALUES
('retrait'),
('envoi_sans_frais'),
('envoi_avec_frais');

INSERT INTO zone (code) VALUES
('tana'),
('province');


INSERT INTO grille_tarifaire (operateur_id , type_operation_id, montant_min, montant_max) VALUES
( 1 , 1, 1, 1000),
( 1 , 1, 1001, 5000),
( 1 , 1, 5001, 10000),
( 1 , 1, 10001, 25000),
( 1 , 1, 25001, 50000),
( 1 , 1, 50001, 100000),
( 1 , 1, 100001, 250000),
( 1 , 1, 250001, 500000),
( 1 , 1, 500001, 1000000),
( 1 , 1, 1000001, 2000000),
( 1 , 1, 2000001, 3000000),
( 1 , 1, 3000001, 4000000),
( 1 , 1, 4000001, 5000000),
( 1 , 1, 5000001, NULL);

INSERT INTO grille_tarifaire ( operateur_id  , type_operation_id, montant_min, montant_max) VALUES
( 1 , 2, 1, 1000),
( 1 , 2, 1001, 5000),
( 1 , 2, 5001, 10000),
( 1 , 2, 10001, 25000),
( 1 , 2, 25001, 50000),
( 1 , 2, 50001, 100000),
( 1 , 2, 100001, 250000),
( 1 , 2, 250001, 500000),
( 1 , 2, 500001, 1000000),
( 1 , 2, 1000001, 2000000),
( 1 , 2, 2000001, 3000000),
( 1 , 2, 3000001, 4000000),
( 1 , 2, 4000001, 5000000),
( 1 , 2, 5000001, NULL);


INSERT INTO grille_tarifaire ( operateur_id  , type_operation_id, montant_min, montant_max) VALUES
( 1 , 3, 1, 1000),
( 1 , 3, 1001, 5000),
( 1 , 3, 5001, 10000),
( 1 , 3, 10001, 25000),
( 1 , 3, 25001, 50000),
( 1 , 3, 50001, 100000),
( 1 , 3, 100001, 250000),
( 1 , 3, 250001, 500000),
( 1 , 3, 500001, 1000000),
( 1 , 3, 1000001, 2000000),
( 1 , 3, 2000001, 3000000),
( 1 , 3, 3000001, 4000000),
( 1 , 3, 4000001, 5000000),
( 1 , 3, 5000001, NULL);

-- frais de retrait 
INSERT INTO frais (grille_id, zone_id, montant) VALUES
(1, NULL, 0),
(2, NULL, 150),
(3, NULL, 275),
(4, NULL, 550),
(5, NULL, 1300),
(6, NULL, 1900),
(7, NULL, 3400),
(8, NULL, 4700),
(9, NULL, 8800),
(10, NULL, 14700),
(11, NULL, 19600),
(12, NULL, 24500),
(13, NULL, 29400),
(14, NULL, 29400);

-- Frais d'envoie sans frais 
INSERT INTO frais (grille_id, zone_id, montant) VALUES
(15, 1, 0), (15, 2, 0),
(16, 1, 100), (16, 2, 150),
(17, 1, 300), (17, 2, 275),
(18, 1, 400), (18, 2, 550),
(19, 1, 700), (19, 2, 1300),
(20, 1, 1100), (20, 2, 1900),
(21, 1, 2000), (21, 2, 3400),
(22, 1, 2500), (22, 2, 4700),
(23, 1, 3000), (23, 2, 8800),
(24, 1, 5000), (24, 2, 14700),
(25, 1, 10000), (25, 2, 19600),
(26, 1, 15000), (26, 2, 24500), 
(27, 1, 20000), (27, 2, 29400), 
(28, 1, 29400), (28, 2, 29400);



--- Frais d'envoie d'argent avec frais
INSERT INTO frais (grille_id, zone_id, montant) VALUES
(29, 1, 100), (29, 2, 300),
(30, 1, 400), (30, 2, 500),
(31, 1, 700), (31, 2, 800),
(32, 1, 1100), (32, 2, 1300),
(33, 1, 2200), (33, 2, 3000),
(34, 1, 3300), (34, 2, 4000),
(35, 1, 6000), (35, 2, 7000),
(36, 1, 8000), (36, 2, 9500),
(37, 1, 12500), (37, 2, 18500),
(38, 1, 21000), (38, 2, 31000),
(39, 1, 31000), (39, 2, 41000),
(40, 1, 41000), (40, 2, 51000),
(41, 1, 51000), (41, 2, 61000),
(42, 1, 61000), (42, 2, 71000);




