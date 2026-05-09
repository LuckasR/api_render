package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.Roles;
import com.gestion.cashpoint.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolesController {

    @Autowired
    private RolesService service;

    @GetMapping
    public List<Roles> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Roles getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public Roles create(@RequestBody Roles obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public Roles update(@RequestBody Roles obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}