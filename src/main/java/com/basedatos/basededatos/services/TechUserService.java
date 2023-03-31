package com.basedatos.basededatos.services;



import com.basedatos.basededatos.dao.imp.TechUserDaoImp;
import com.basedatos.basededatos.models.GasolineraModel;
import com.basedatos.basededatos.models.TechUserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@CrossOrigin
@Service

public class TechUserService {

    @Autowired
    TechUserDaoImp TechUser_Dao;

    public List<TechUserModel> getAll(){
        return  TechUser_Dao.getTAll();
    }

    public  TechUserModel register (TechUserModel techUserModel){
        return TechUser_Dao.registerT(techUserModel);
    }

    public void delete(@PathVariable long id) {
        TechUser_Dao.deleteT(id);
    }
}
