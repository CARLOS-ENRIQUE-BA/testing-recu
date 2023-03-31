package com.basedatos.basededatos.dao;


import com.basedatos.basededatos.models.TechModel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface Tech_Dao {
    @Transactional
    List<TechModel> getCAll();

    @Transactional
    TechModel getC(long id);

    @Transactional
    TechModel registerC(TechModel techModel);

    @Transactional
    TechModel updateC(TechModel techModel);

    @Transactional
    void deleteC(long id);


}
