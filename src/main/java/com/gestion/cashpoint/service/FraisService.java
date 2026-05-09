package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface FraisService {
    List<Frais> getAll();
    Frais getById(Integer id);
    void save(Frais obj);
    void delete(Integer id);
}