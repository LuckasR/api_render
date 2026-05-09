package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraisServiceImpl implements FraisService {

    @Autowired
    private FraisRepository repo;

    public List<Frais> getAll() { return repo.findAll(); }
    public Frais getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(Frais obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}