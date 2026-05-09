package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface RolesService {
    List<Roles> getAll();
    Roles getById(Integer id);
    void save(Roles obj);
    void delete(Integer id);
}