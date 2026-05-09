package com.gestion.cashpoint.model;
import jakarta.persistence.*;
import java.math.*;
import java.time.*;

@Entity
@Table(name = "paiements_abonnements")
public class PaiementsAbonnements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "company_abonnement_id")
    private CompanyAbonnements companyAbonnements;

    private BigDecimal montant;

    private String datePaiement;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public CompanyAbonnements getCompanyAbonnements() { return companyAbonnements; }
    public void setCompanyAbonnements(CompanyAbonnements companyAbonnements) { this.companyAbonnements = companyAbonnements; }

    public BigDecimal getMontant() { return montant; }
    public void setMontant(BigDecimal montant) { this.montant = montant; }

    public String getDatePaiement() { return datePaiement; }
    public void setDatePaiement(String datePaiement) { this.datePaiement = datePaiement; }

}