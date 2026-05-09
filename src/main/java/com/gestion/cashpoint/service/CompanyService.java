package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface CompanyService {
    List<Company> getAll();
    Company getById(Integer id);
    void save(Company obj);
    void delete(Integer id);
}