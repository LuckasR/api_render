package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {}