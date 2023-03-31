package com.basedatos.basededatos.controllers;


import com.basedatos.basededatos.models.TechModel;
import com.basedatos.basededatos.services.TechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tech")
@CrossOrigin
public class TechController {

    @Autowired
    TechService techService;

    @GetMapping("/getAll")
    List<TechModel> getAll(){
        return techService.getALL();
    }

    @PostMapping(value = "/create")
    TechModel create(@RequestBody TechModel techModel){
        return techService.register(techModel);
    }


}
