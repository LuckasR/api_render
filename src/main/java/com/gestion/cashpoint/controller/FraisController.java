package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.Frais;
import com.gestion.cashpoint.service.FraisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/frais")
public class FraisController {

    @Autowired
    private FraisService service;

    @GetMapping
    public List<Frais> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Frais getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public Frais create(@RequestBody Frais obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public Frais update(@RequestBody Frais obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}