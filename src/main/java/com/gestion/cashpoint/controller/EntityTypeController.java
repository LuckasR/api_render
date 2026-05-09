package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.EntityType;
import com.gestion.cashpoint.service.EntityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/entityType")
public class EntityTypeController {

    @Autowired
    private EntityTypeService service;

    @GetMapping
    public List<EntityType> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public EntityType getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public EntityType create(@RequestBody EntityType obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public EntityType update(@RequestBody EntityType obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}