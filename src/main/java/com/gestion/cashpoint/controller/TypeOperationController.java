package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.TypeOperation;
import com.gestion.cashpoint.service.TypeOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/typeOperation")
public class TypeOperationController {

    @Autowired
    private TypeOperationService service;

    @GetMapping
    public List<TypeOperation> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TypeOperation getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public TypeOperation create(@RequestBody TypeOperation obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public TypeOperation update(@RequestBody TypeOperation obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}