package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.TypeDepenses;
import com.gestion.cashpoint.service.TypeDepensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/typeDepenses")
public class TypeDepensesController {

    @Autowired
    private TypeDepensesService service;

    @GetMapping
    public List<TypeDepenses> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TypeDepenses getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public TypeDepenses create(@RequestBody TypeDepenses obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public TypeDepenses update(@RequestBody TypeDepenses obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}