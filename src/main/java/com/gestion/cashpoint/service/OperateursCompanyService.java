package com.gestion.cashpoint.service;

import com.gestion.cashpoint.model.*;
import java.util.List;

public interface OperateursCompanyService {
    List<OperateursCompany> getAll();
    OperateursCompany getById(Integer id);
    void save(OperateursCompany obj);
    void delete(Integer id);
}