package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface UtilisateursService {
    List<Utilisateurs> getAll();
    Utilisateurs getById(Integer id);
    void save(Utilisateurs obj);
    void delete(Integer id);
}