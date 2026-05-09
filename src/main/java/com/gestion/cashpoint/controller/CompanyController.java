package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.Company;
import com.gestion.cashpoint.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService service;

    @GetMapping
    public List<Company> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Company getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public Company create(@RequestBody Company obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public Company update(@RequestBody Company obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}