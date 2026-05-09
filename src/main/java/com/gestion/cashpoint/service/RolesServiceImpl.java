package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImpl implements RolesService {

    @Autowired
    private RolesRepository repo;

    public List<Roles> getAll() { return repo.findAll(); }
    public Roles getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(Roles obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}