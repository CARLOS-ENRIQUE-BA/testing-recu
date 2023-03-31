package com.basedatos.basededatos.services;


import com.basedatos.basededatos.dao.imp.TechDaoImp;
import com.basedatos.basededatos.models.TechModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@CrossOrigin
@Service

public class TechService {

    @Autowired
    TechDaoImp Tech_Dao;

    public List<TechModel> getALL() {return  Tech_Dao.getCAll();}

    public  TechModel register (TechModel techModel){
        return Tech_Dao.registerC(techModel);
    }

    public void delete(@PathVariable long id) {
        Tech_Dao.deleteC(id);
    }



}
