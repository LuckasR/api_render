package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateursServiceImpl implements UtilisateursService {

    @Autowired
    private UtilisateursRepository repo;

    public List<Utilisateurs> getAll() { return repo.findAll(); }
    public Utilisateurs getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(Utilisateurs obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}