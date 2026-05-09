package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer> {}