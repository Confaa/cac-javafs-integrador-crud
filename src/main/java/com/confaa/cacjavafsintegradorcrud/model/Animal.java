package com.confaa.cacjavafsintegradorcrud.model;

import java.util.Date;

public class Animal {
    private int idAnimal;
    private String nombre;
    private String especie;
    private String raza;
    private String nacimiento;

    private String foto;

    public Animal() {
    }

    public Animal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Animal(int idAnimal, String nombre, String especie, String raza,
                  String nacimiento, String foto) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.nacimiento = nacimiento;
        this.foto = foto;
    }

    public Animal(String nombre, String especie, String raza,
                  String nacimiento, String foto) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.nacimiento = nacimiento;
        this.foto = foto;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
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

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
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
               "idMascota=" + idAnimal +
               ", nombre='" + nombre + '\'' +
               ", especie='" + especie + '\'' +
               ", raza='" + raza + '\'' +
               ", nacimiento=" + nacimiento +
               ", foto='" + foto + '\'' +
               '}';
    }
}
