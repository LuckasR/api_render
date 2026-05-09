package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.Operateurs;
import com.gestion.cashpoint.service.OperateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/operateurs")
public class OperateursController {

    @Autowired
    private OperateursService service;

    @GetMapping
    public List<Operateurs> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Operateurs getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public Operateurs create(@RequestBody Operateurs obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public Operateurs update(@RequestBody Operateurs obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}