package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.Abonnements;
import com.gestion.cashpoint.service.AbonnementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/abonnements")
public class AbonnementsController {

    @Autowired
    private AbonnementsService service;

    @GetMapping
    public List<Abonnements> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Abonnements getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public Abonnements create(@RequestBody Abonnements obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public Abonnements update(@RequestBody Abonnements obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}