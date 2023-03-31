package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.GasolineraModel;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin

public interface Register_Dao {

    List<RegisterModel> getRALL();

    RegisterModel getR(long id);
    RegisterModel registerR( RegisterModel registerModel);
    RegisterModel updateR( RegisterModel registerModel);
    void deleteR(long id);

}
