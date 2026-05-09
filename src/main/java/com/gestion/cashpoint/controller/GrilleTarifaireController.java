package com.gestion.cashpoint.controller;

import com.gestion.cashpoint.model.GrilleTarifaire;
import com.gestion.cashpoint.service.GrilleTarifaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/grilleTarifaire")
public class GrilleTarifaireController {

    @Autowired
    private GrilleTarifaireService service;

    @GetMapping
    public List<GrilleTarifaire> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GrilleTarifaire getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public GrilleTarifaire create(@RequestBody GrilleTarifaire obj) {
        service.save(obj);
        return obj;
    }

    @PutMapping
    public GrilleTarifaire update(@RequestBody GrilleTarifaire obj) {
        service.save(obj);
        return obj;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}