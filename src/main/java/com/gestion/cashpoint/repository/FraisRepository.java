package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.Frais;

public interface FraisRepository extends JpaRepository<Frais, Integer> {}