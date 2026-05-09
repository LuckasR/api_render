package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface ZoneService {
    List<Zone> getAll();
    Zone getById(Integer id);
    void save(Zone obj);
    void delete(Integer id);
}