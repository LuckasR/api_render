package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface GrilleTarifaireService {
    List<GrilleTarifaire> getAll();
    GrilleTarifaire getById(Integer id);
    void save(GrilleTarifaire obj);
    void delete(Integer id);
}