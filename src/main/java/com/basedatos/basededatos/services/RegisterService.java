package com.basedatos.basededatos.services;


import com.basedatos.basededatos.dao.imp.GasolineraDaoImp;
import com.basedatos.basededatos.dao.imp.RegisterDaoImp;
import com.basedatos.basededatos.models.GasolineraModel;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import com.basedatos.basededatos.dao.Register_Dao;


import java.util.List;

@CrossOrigin
@Service
public class RegisterService {

    @Autowired
    RegisterDaoImp Register_Dao;

    public List<RegisterModel> getAll(){
        return  Register_Dao.getRALL();
    }

    public  RegisterModel register (RegisterModel registerModel){
        return Register_Dao.registerR(registerModel);
    }

    public void deleteR(@PathVariable long id) {
        Register_Dao.deleteR(id);
    }

}
