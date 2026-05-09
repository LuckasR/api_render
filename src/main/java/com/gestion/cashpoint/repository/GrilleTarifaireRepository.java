package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.GrilleTarifaire;

public interface GrilleTarifaireRepository extends JpaRepository<GrilleTarifaire, Integer> {}