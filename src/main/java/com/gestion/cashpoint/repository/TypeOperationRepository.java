package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.TypeOperation;

public interface TypeOperationRepository extends JpaRepository<TypeOperation, Integer> {}