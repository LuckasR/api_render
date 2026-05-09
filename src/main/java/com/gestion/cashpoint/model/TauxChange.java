package com.gestion.cashpoint.model;
import jakarta.persistence.*;
import java.math.*;
import java.time.*;

@Entity
@Table(name = "taux_change")
public class TauxChange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String deviseSource;

    private String deviseCible;

    private BigDecimal taux;

    private LocalDate dateApplication;

    private Boolean actif;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDeviseSource() { return deviseSource; }
    public void setDeviseSource(String deviseSource) { this.deviseSource = deviseSource; }

    public String getDeviseCible() { return deviseCible; }
    public void setDeviseCible(String deviseCible) { this.deviseCible = deviseCible; }

    public BigDecimal getTaux() { return taux; }
    public void setTaux(BigDecimal taux) { this.taux = taux; }

    public LocalDate getDateApplication() { return dateApplication; }
    public void setDateApplication(LocalDate dateApplication) { this.dateApplication = dateApplication; }

    public Boolean getActif() { return actif; }
    public void setActif(Boolean actif) { this.actif = actif; }

}