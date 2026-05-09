package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface PaiementsAbonnementsService {
    List<PaiementsAbonnements> getAll();
    PaiementsAbonnements getById(Integer id);
    void save(PaiementsAbonnements obj);
    void delete(Integer id);
}