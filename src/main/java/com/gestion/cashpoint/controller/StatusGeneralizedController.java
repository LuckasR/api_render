package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.StatusGeneralized;
import com.gestion.cashpoint.service.StatusGeneralizedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/statusGeneralized")
public class StatusGeneralizedController {

    @Autowired
    private StatusGeneralizedService service;

    @GetMapping
    public List<StatusGeneralized> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StatusGeneralized getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public StatusGeneralized create(@RequestBody StatusGeneralized obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public StatusGeneralized update(@RequestBody StatusGeneralized obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}