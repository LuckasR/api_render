package com.gestion.cashpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.cashpoint.model.OperateursCompany;

public interface OperateursCompanyRepository extends JpaRepository<OperateursCompany, Integer> {}