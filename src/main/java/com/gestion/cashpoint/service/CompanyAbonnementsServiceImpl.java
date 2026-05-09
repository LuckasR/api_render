package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyAbonnementsServiceImpl implements CompanyAbonnementsService {

    @Autowired
    private CompanyAbonnementsRepository repo;

    public List<CompanyAbonnements> getAll() { return repo.findAll(); }
    public CompanyAbonnements getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(CompanyAbonnements obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}