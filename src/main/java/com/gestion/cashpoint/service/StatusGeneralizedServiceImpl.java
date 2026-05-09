package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import com.gestion.cashpoint.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusGeneralizedServiceImpl implements StatusGeneralizedService {

    @Autowired
    private StatusGeneralizedRepository repo;

    public List<StatusGeneralized> getAll() { return repo.findAll(); }
    public StatusGeneralized getById(Integer id) { return repo.findById(id).orElse(null); }
    public void save(StatusGeneralized obj) { repo.save(obj); }
    public void delete(Integer id) { repo.deleteById(id); }
}