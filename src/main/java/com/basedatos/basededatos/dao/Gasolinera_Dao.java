package com.basedatos.basededatos.dao;



import com.basedatos.basededatos.models.GasolineraModel;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin

public interface Gasolinera_Dao {

    List<GasolineraModel> getGAll();
    GasolineraModel getG(long id);
    GasolineraModel registerG( GasolineraModel gasolineraModel);
    GasolineraModel updateG( GasolineraModel gasolineraModel);
    void deleteG(long id);

    @Transactional
    abstract RegisterModel getR(long id);

    @Transactional
    RegisterModel registerR(RegisterModel registerModel);

    @Transactional
    RegisterModel updateR(RegisterModel registerModel);

    @Transactional
    void deleteR(long id);
}
