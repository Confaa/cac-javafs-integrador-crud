package com.confaa.cacjavafsintegradorcrud.model;

import java.util.ArrayList;
import java.util.List;

public class ModelHC implements Model {
    private List<Motor> motores;

    public ModelHC() {
        this.motores = new ArrayList<>();
    }

    @Override
    public List<Motor> getMotores() {
        return this.motores;
    }

    @Override
    public Motor getMotor(int id) {
        Motor motor = null;
        for (int i = 0; i < this.motores.size(); i++) {
            if (this.motores.get(i).getIdMotor() == id) {
                motor = this.motores.get(i);
            }
        }
        return motor;
    }

    @Override
    public int addMotor(Motor motor) {
        this.motores.add(motor);
        return 0;
    }

    @Override
    public int updateMotor(Motor motor) {
        Motor motorBuscado = getMotor(motor.getIdMotor());
        int i = this.motores.indexOf(motorBuscado);
        this.motores.set(i, motor);
        return 0;
    }

    @Override
    public int deleteMotor(int id) {
        Motor motorBuscado = getMotor(id);
        this.motores.remove(motorBuscado);
        return 0;
    }
}
