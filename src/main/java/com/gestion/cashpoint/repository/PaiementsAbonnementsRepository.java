package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.PaiementsAbonnements;

public interface PaiementsAbonnementsRepository extends JpaRepository<PaiementsAbonnements, Integer> {}