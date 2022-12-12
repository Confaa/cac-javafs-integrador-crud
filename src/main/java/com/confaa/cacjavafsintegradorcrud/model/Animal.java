package com.confaa.cacjavafsintegradorcrud.model;

import java.util.Date;

public class Animal {
    private int idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private Date nacimiento;

    private String foto;

    public Animal() {
    }

    public Animal(int idMascota) {
        this.idMascota = idMascota;
    }

    public Animal(int idMascota, String nombre, String especie, String raza,
                  Date nacimiento, String foto) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.nacimiento = nacimiento;
        this.foto = foto;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Animal{" +
               "idMascota=" + idMascota +
               ", nombre='" + nombre + '\'' +
               ", especie='" + especie + '\'' +
               ", raza='" + raza + '\'' +
               ", nacimiento=" + nacimiento +
               ", foto='" + foto + '\'' +
               '}';
    }
}
