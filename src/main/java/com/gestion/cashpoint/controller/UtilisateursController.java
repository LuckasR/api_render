package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.Utilisateurs;
import com.gestion.cashpoint.service.UtilisateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateursController {

    @Autowired
    private UtilisateursService service;

    @GetMapping
    public List<Utilisateurs> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Utilisateurs getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public Utilisateurs create(@RequestBody Utilisateurs obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public Utilisateurs update(@RequestBody Utilisateurs obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}