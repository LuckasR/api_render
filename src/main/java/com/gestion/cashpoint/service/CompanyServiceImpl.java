package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository repo;

    public List<Company> getAll() { return repo.findAll(); }
    public Company getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(Company obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}