package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface AbonnementsService {
    List<Abonnements> getAll();
    Abonnements getById(Integer id);
    void save(Abonnements obj);
    void delete(Integer id);
}