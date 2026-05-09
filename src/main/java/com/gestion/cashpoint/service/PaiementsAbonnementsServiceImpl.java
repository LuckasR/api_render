package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaiementsAbonnementsServiceImpl implements PaiementsAbonnementsService {

    @Autowired
    private PaiementsAbonnementsRepository repo;

    public List<PaiementsAbonnements> getAll() { return repo.findAll(); }
    public PaiementsAbonnements getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(PaiementsAbonnements obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}