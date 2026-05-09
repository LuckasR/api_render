package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbonnementsServiceImpl implements AbonnementsService {

    @Autowired
    private AbonnementsRepository repo;

    public List<Abonnements> getAll() { return repo.findAll(); }
    public Abonnements getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(Abonnements obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}