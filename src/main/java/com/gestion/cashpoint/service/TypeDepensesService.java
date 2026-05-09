package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface TypeDepensesService {
    List<TypeDepenses> getAll();
    TypeDepenses getById(Integer id);
    void save(TypeDepenses obj);
    void delete(Integer id);
}