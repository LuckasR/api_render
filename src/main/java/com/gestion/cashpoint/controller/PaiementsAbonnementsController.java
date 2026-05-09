package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.PaiementsAbonnements;
import com.gestion.cashpoint.service.PaiementsAbonnementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/paiementsAbonnements")
public class PaiementsAbonnementsController {

    @Autowired
    private PaiementsAbonnementsService service;

    @GetMapping
    public List<PaiementsAbonnements> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PaiementsAbonnements getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public PaiementsAbonnements create(@RequestBody PaiementsAbonnements obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public PaiementsAbonnements update(@RequestBody PaiementsAbonnements obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}