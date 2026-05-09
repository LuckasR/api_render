package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneServiceImpl implements ZoneService {

    @Autowired
    private ZoneRepository repo;

    public List<Zone> getAll() { return repo.findAll(); }
    public Zone getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(Zone obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}