package com.basedatos.basededatos.models;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Entity
@Table(schema = "gasolinera")

public class GasolineraModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name_gasolinera")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name_gasolinera;

    @Column(name = "ubicacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ubicacion;

    @Column(name = "activa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private boolean activa;

    @Column(name = "total_gasolineras")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int total_gasolineras;

    @Column(name = "telefono")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String telefono;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName_gasolinera() {
        return name_gasolinera;
    }

    public void setName_gasolinera(String name_gasolinera) {
        this.name_gasolinera = name_gasolinera;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getTotal_gasolineras() {
        return total_gasolineras;
    }

    public void setTotal_gasolineras(int total_gasolineras) {
        this.total_gasolineras = total_gasolineras;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
