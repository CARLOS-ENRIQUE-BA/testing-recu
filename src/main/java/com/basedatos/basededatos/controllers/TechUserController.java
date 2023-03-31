package com.basedatos.basededatos.controllers;


import com.basedatos.basededatos.models.GasolineraModel;
import com.basedatos.basededatos.models.TechUserModel;
import com.basedatos.basededatos.services.TechUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/techuser")
@CrossOrigin

public class TechUserController {

    @Autowired
    TechUserService techUserService;

    @GetMapping("/getAll")
    List<TechUserModel> getAll(){
        return techUserService.getAll();
    }

    @PostMapping(value = "/create")
    TechUserModel create(@RequestBody TechUserModel techUserModel){
        return techUserService.register(techUserModel);
    }
}
