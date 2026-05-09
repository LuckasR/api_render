package com.gestion.cashpoint.model;
import jakarta.persistence.*;
import java.math.*;
import java.time.*;

@Entity
@Table(name = "frais")
public class Frais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "grille_id")
    private GrilleTarifaire grilleTarifaire;

    @ManyToOne
    @JoinColumn(name = "zone_id")
    private Zone zone;

    private BigDecimal montant;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    public GrilleTarifaire getGrilleTarifaire() { return grilleTarifaire; }
    public void setGrilleTarifaire(GrilleTarifaire grilleTarifaire) { this.grilleTarifaire = grilleTarifaire; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }

    public BigDecimal getMontant() { return montant; }
    public void setMontant(BigDecimal montant) { this.montant = montant; }

}