package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface StatusGeneralizedService {
    List<StatusGeneralized> getAll();
    StatusGeneralized getById(Integer id);
    void save(StatusGeneralized obj);
    void delete(Integer id);
}