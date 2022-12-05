package com.confaa.cacjavafsintegradorcrud.model;

public class Motor {
    private int idMotor;
    private double potencia;
    private short rpm;
    private String foto;

    private DatosCuerpo datosCuerpo;

    public Motor() {

    }

    public Motor(int idMotor) {
        this.idMotor = idMotor;
    }

    public Motor(int idMotor, double potencia, short rpm, String foto,
                 DatosCuerpo datosCuerpo) {
        this.idMotor = idMotor;
        this.potencia = potencia;
        this.rpm = rpm;
        this.foto = foto;
        this.datosCuerpo = datosCuerpo;
    }

    public int getIdMotor() {
        return idMotor;
    }

    public void setIdMotor(int idMotor) {
        this.idMotor = idMotor;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public short getRpm() {
        return rpm;
    }

    public void setRpm(short rpm) {
        this.rpm = rpm;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public DatosCuerpo getDatosCuerpo() {
        return datosCuerpo;
    }

    public void setDatosCuerpo(
            DatosCuerpo datosCuerpo) {
        this.datosCuerpo = datosCuerpo;
    }

    @Override
    public String toString() {
        return "Motor{" +
               "idMotor=" + idMotor +
               ", potencia=" + potencia +
               ", rpm=" + rpm +
               ", foto='" + foto + '\'' +
               ", datosCuerpo=" + datosCuerpo +
               '}';
    }
}
