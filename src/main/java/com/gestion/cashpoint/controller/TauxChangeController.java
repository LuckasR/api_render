package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.TauxChange;
import com.gestion.cashpoint.service.TauxChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tauxChange")
public class TauxChangeController {

    @Autowired
    private TauxChangeService service;

    @GetMapping
    public List<TauxChange> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TauxChange getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public TauxChange create(@RequestBody TauxChange obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public TauxChange update(@RequestBody TauxChange obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}