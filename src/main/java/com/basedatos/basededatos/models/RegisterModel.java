package com.basedatos.basededatos.models;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Entity
@Table(schema = "register")



public class RegisterModel {


    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;

    @Column(name = "password")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String password;

    @Column(name = "confirm_password")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String  confirm_password;

    @Column(name = "email")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email;



    @Column(name = "phone")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String phone;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
