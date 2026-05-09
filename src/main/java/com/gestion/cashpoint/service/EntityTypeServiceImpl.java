package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityTypeServiceImpl implements EntityTypeService {

    @Autowired
    private EntityTypeRepository repo;

    public List<EntityType> getAll() { return repo.findAll(); }
    public EntityType getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(EntityType obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}