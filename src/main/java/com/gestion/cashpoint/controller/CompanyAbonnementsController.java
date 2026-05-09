package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.CompanyAbonnements;
import com.gestion.cashpoint.service.CompanyAbonnementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/companyAbonnements")
public class CompanyAbonnementsController {

    @Autowired
    private CompanyAbonnementsService service;

    @GetMapping
    public List<CompanyAbonnements> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CompanyAbonnements getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public CompanyAbonnements create(@RequestBody CompanyAbonnements obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public CompanyAbonnements update(@RequestBody CompanyAbonnements obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}