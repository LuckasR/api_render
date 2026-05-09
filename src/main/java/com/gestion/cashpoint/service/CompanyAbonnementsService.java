package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface CompanyAbonnementsService {
    List<CompanyAbonnements> getAll();
    CompanyAbonnements getById(Integer id);
    void save(CompanyAbonnements obj);
    void delete(Integer id);
}