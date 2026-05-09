package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperateursServiceImpl implements OperateursService {

    @Autowired
    private OperateursRepository repo;

    public List<Operateurs> getAll() { return repo.findAll(); }
    public Operateurs getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(Operateurs obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}