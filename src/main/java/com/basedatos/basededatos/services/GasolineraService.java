package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.imp.GasolineraDaoImp;
import com.basedatos.basededatos.models.GasolineraModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@CrossOrigin
@Service
public class GasolineraService {
    @Autowired
    GasolineraDaoImp Gasolinera_Dao;

    public List<GasolineraModel> getAll(){
        return  Gasolinera_Dao.getGAll();
    }

    public  GasolineraModel register (GasolineraModel gasolineraModel){
        return Gasolinera_Dao.registerG(gasolineraModel);
    }

    public void delete(@PathVariable long id) {
        Gasolinera_Dao.deleteG(id);
    }



}
