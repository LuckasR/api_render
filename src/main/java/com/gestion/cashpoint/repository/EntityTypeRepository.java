package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.EntityType;

public interface EntityTypeRepository extends JpaRepository<EntityType, Integer> {}