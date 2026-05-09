package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.Zone;

public interface ZoneRepository extends JpaRepository<Zone, Integer> {}