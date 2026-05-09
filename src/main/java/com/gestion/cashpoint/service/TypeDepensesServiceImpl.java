package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeDepensesServiceImpl implements TypeDepensesService {

    @Autowired
    private TypeDepensesRepository repo;

    public List<TypeDepenses> getAll() { return repo.findAll(); }
    public TypeDepenses getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(TypeDepenses obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}