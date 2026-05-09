package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.TauxChange;

public interface TauxChangeRepository extends JpaRepository<TauxChange, Integer> {}