package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TauxChangeServiceImpl implements TauxChangeService {

    @Autowired
    private TauxChangeRepository repo;

    public List<TauxChange> getAll() { return repo.findAll(); }
    public TauxChange getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(TauxChange obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}