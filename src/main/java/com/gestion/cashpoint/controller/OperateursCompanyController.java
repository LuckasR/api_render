package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.OperateursCompany;
import com.gestion.cashpoint.service.OperateursCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/operateursCompany")
public class OperateursCompanyController {

    @Autowired
    private OperateursCompanyService service;

    @GetMapping
    public List<OperateursCompany> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public OperateursCompany getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public OperateursCompany create(@RequestBody OperateursCompany obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public OperateursCompany update(@RequestBody OperateursCompany obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}