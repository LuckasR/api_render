package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface TypeOperationService {
    List<TypeOperation> getAll();
    TypeOperation getById(Integer id);
    void save(TypeOperation obj);
    void delete(Integer id);
}