package com.basedatos.basededatos.models;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.Date;


@CrossOrigin
@Entity
@Table(schema = "techuser")

public class TechUserModel {

    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    @Column(name = "apellido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String apellido;

    @Column(name = "correo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String correo;

    @Column(name = "contrasenia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String contrasenia;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
