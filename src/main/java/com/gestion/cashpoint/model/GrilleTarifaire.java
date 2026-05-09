package com.gestion.cashpoint.model;
import jakarta.persistence.*;
import java.math.*;
import java.time.*;

@Entity
@Table(name = "grille_tarifaire")
public class GrilleTarifaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "type_operation_id")
    private TypeOperation typeOperation;

    @ManyToOne
    @JoinColumn(name = "operateur_id")
    private Operateurs operateurs;

    private BigDecimal montantMin;

    private BigDecimal montantMax;

    private String createdAt;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public TypeOperation getTypeOperation() { return typeOperation; }
    public void setTypeOperation(TypeOperation typeOperation) { this.typeOperation = typeOperation; }

    public Operateurs getOperateurs() { return operateurs; }
    public void setOperateurs(Operateurs operateurs) { this.operateurs = operateurs; }

    public BigDecimal getMontantMin() { return montantMin; }
    public void setMontantMin(BigDecimal montantMin) { this.montantMin = montantMin; }

    public BigDecimal getMontantMax() { return montantMax; }
    public void setMontantMax(BigDecimal montantMax) { this.montantMax = montantMax; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

}