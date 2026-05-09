package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperateursCompanyServiceImpl implements OperateursCompanyService {

    @Autowired
    private OperateursCompanyRepository repo;

    public List<OperateursCompany> getAll() { return repo.findAll(); }
    public OperateursCompany getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(OperateursCompany obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}