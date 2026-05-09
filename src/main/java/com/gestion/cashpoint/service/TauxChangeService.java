package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface TauxChangeService {
    List<TauxChange> getAll();
    TauxChange getById(Integer id);
    void save(TauxChange obj);
    void delete(Integer id);
}