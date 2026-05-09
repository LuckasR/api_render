package com.gestion.cashpoint.model;
import jakarta.persistence.*;
import java.math.*;
import java.time.*;

@Entity
@Table(name = "utilisateurs")
public class Utilisateurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;

    private String matricule;

    private String name;

    private String prenom;

    private String identifiant;

    private String motDePasseHash;

    private Boolean peutOuvrirCaisse;

    private Boolean peutFermerCaisse;

    private Boolean peutValiderTransaction;

    private Boolean peutVoirRapports;

    private Boolean peutGererUtilisateurs;

    private Boolean actif;

    private String dateDerniereConnexion;

    private Integer tentativesConnexion;

    private String bloqueJusqu;

    private String createdAt;

    private String updatedAt;

    @ManyToOne
    @JoinColumn(name = "cree_par")
    private Utilisateurs utilisateurs;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    public Roles getRoles() { return roles; }
    public void setRoles(Roles roles) { this.roles = roles; }

    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getIdentifiant() { return identifiant; }
    public void setIdentifiant(String identifiant) { this.identifiant = identifiant; }

    public String getMotDePasseHash() { return motDePasseHash; }
    public void setMotDePasseHash(String motDePasseHash) { this.motDePasseHash = motDePasseHash; }

    public Boolean getPeutOuvrirCaisse() { return peutOuvrirCaisse; }
    public void setPeutOuvrirCaisse(Boolean peutOuvrirCaisse) { this.peutOuvrirCaisse = peutOuvrirCaisse; }

    public Boolean getPeutFermerCaisse() { return peutFermerCaisse; }
    public void setPeutFermerCaisse(Boolean peutFermerCaisse) { this.peutFermerCaisse = peutFermerCaisse; }

    public Boolean getPeutValiderTransaction() { return peutValiderTransaction; }
    public void setPeutValiderTransaction(Boolean peutValiderTransaction) { this.peutValiderTransaction = peutValiderTransaction; }

    public Boolean getPeutVoirRapports() { return peutVoirRapports; }
    public void setPeutVoirRapports(Boolean peutVoirRapports) { this.peutVoirRapports = peutVoirRapports; }

    public Boolean getPeutGererUtilisateurs() { return peutGererUtilisateurs; }
    public void setPeutGererUtilisateurs(Boolean peutGererUtilisateurs) { this.peutGererUtilisateurs = peutGererUtilisateurs; }

    public Boolean getActif() { return actif; }
    public void setActif(Boolean actif) { this.actif = actif; }

    public String getDateDerniereConnexion() { return dateDerniereConnexion; }
    public void setDateDerniereConnexion(String dateDerniereConnexion) { this.dateDerniereConnexion = dateDerniereConnexion; }

    public Integer getTentativesConnexion() { return tentativesConnexion; }
    public void setTentativesConnexion(Integer tentativesConnexion) { this.tentativesConnexion = tentativesConnexion; }

    public String getBloqueJusqu() { return bloqueJusqu; }
    public void setBloqueJusqu(String bloqueJusqu) { this.bloqueJusqu = bloqueJusqu; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public String getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }

    public Utilisateurs getUtilisateurs() { return utilisateurs; }
    public void setUtilisateurs(Utilisateurs utilisateurs) { this.utilisateurs = utilisateurs; }

}