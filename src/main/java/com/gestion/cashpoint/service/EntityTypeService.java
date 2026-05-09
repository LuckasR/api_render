package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface EntityTypeService {
    List<EntityType> getAll();
    EntityType getById(Integer id);
    void save(EntityType obj);
    void delete(Integer id);
}