package com.confaa.cacjavafsintegradorcrud.model;

import java.util.List;

public interface Model {
    public List<Motor> getMotores();

    public Motor getMotor(int id);

    public int addMotor(Motor motor);

    public int updateMotor(Motor motor);

    public int deleteMotor(int id);
}