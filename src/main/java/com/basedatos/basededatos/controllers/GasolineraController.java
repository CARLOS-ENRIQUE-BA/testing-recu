package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.GasolineraModel;
import com.basedatos.basededatos.services.GasolineraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gas")
@CrossOrigin
public class GasolineraController {

        @Autowired
        GasolineraService gasolineraService;

        @GetMapping("/getAll")
        List<GasolineraModel> getAll(){
            return gasolineraService.getAll();
        }

        @PostMapping(value = "/create")
        GasolineraModel create(@RequestBody GasolineraModel gasolineraModel){
            return gasolineraService.register(gasolineraModel);
        }
    }
