package com.gestion.cashpoint.model;
import jakarta.persistence.*;
import java.math.*;
import java.time.*;

@Entity
@Table(name = "company_abonnements")
public class CompanyAbonnements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "abonnement_id")
    private Abonnements abonnements;

    private String dateDebut;

    private String dateFin;

    @ManyToOne
    @JoinColumn(name = "statut")
    private StatusGeneralized statusGeneralized;

    private String createdAt;

    private String updatedAt;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    public Abonnements getAbonnements() { return abonnements; }
    public void setAbonnements(Abonnements abonnements) { this.abonnements = abonnements; }

    public String getDateDebut() { return dateDebut; }
    public void setDateDebut(String dateDebut) { this.dateDebut = dateDebut; }

    public String getDateFin() { return dateFin; }
    public void setDateFin(String dateFin) { this.dateFin = dateFin; }

    public StatusGeneralized getStatusGeneralized() { return statusGeneralized; }
    public void setStatusGeneralized(StatusGeneralized statusGeneralized) { this.statusGeneralized = statusGeneralized; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public String getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }

}