package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.Zone;
import com.gestion.cashpoint.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/zone")
public class ZoneController {

    @Autowired
    private ZoneService service;

    @GetMapping
    public List<Zone> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Zone getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public Zone create(@RequestBody Zone obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public Zone update(@RequestBody Zone obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}