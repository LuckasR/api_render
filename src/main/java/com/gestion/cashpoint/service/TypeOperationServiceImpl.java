package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeOperationServiceImpl implements TypeOperationService {

    @Autowired
    private TypeOperationRepository repo;

    public List<TypeOperation> getAll() { return repo.findAll(); }
    public TypeOperation getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(TypeOperation obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}