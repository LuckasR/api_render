package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface OperateursService {
    List<Operateurs> getAll();
    Operateurs getById(Integer id);
    void save(Operateurs obj);
    void delete(Integer id);
}