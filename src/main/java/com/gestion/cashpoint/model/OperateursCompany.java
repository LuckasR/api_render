package com.gestion.cashpoint.model;
import jakarta.persistence.*;
import java.math.*;
import java.time.*;

@Entity
@Table(name = "operateurs_company")
public class OperateursCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "operateur_id")
    private Operateurs operateurs;

    private String numeroCompte;

    private Boolean isActif;

    private String createdAt;

    private String updatedAt;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    public Operateurs getOperateurs() { return operateurs; }
    public void setOperateurs(Operateurs operateurs) { this.operateurs = operateurs; }

    public String getNumeroCompte() { return numeroCompte; }
    public void setNumeroCompte(String numeroCompte) { this.numeroCompte = numeroCompte; }

    public Boolean getIsActif() { return isActif; }
    public void setIsActif(Boolean isActif) { this.isActif = isActif; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public String getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }

}