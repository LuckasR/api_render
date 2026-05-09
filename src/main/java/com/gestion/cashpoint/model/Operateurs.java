package com.gestion.cashpoint.model;
import jakarta.persistence.*;
import java.math.*;
import java.time.*;

@Entity
@Table(name = "operateurs")
public class Operateurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String nom;

    private String prefixeCode;

    private String couleurTheme;

    private String logoUrl;

    private BigDecimal commissionRetrait;

    private BigDecimal commissionDepot;

    private BigDecimal commissionTransfert;

    private Boolean actif;

    private String createdAt;

    private String updatedAt;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrefixeCode() { return prefixeCode; }
    public void setPrefixeCode(String prefixeCode) { this.prefixeCode = prefixeCode; }

    public String getCouleurTheme() { return couleurTheme; }
    public void setCouleurTheme(String couleurTheme) { this.couleurTheme = couleurTheme; }

    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }

    public BigDecimal getCommissionRetrait() { return commissionRetrait; }
    public void setCommissionRetrait(BigDecimal commissionRetrait) { this.commissionRetrait = commissionRetrait; }

    public BigDecimal getCommissionDepot() { return commissionDepot; }
    public void setCommissionDepot(BigDecimal commissionDepot) { this.commissionDepot = commissionDepot; }

    public BigDecimal getCommissionTransfert() { return commissionTransfert; }
    public void setCommissionTransfert(BigDecimal commissionTransfert) { this.commissionTransfert = commissionTransfert; }

    public Boolean getActif() { return actif; }
    public void setActif(Boolean actif) { this.actif = actif; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public String getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }

}