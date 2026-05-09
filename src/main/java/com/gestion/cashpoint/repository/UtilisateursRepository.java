package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.Utilisateurs;

public interface UtilisateursRepository extends JpaRepository<Utilisateurs, Integer> {}