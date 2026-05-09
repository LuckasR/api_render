package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrilleTarifaireServiceImpl implements GrilleTarifaireService {

    @Autowired
    private GrilleTarifaireRepository repo;

    public List<GrilleTarifaire> getAll() { return repo.findAll(); }
    public GrilleTarifaire getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(GrilleTarifaire obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}