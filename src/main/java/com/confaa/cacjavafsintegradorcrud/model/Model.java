package com.confaa.cacjavafsintegradorcrud.model;

import java.util.List;

public interface Model {
    public List<Animal> getAnimales();

    public Animal getAnimal(int id);

    public int addAnimal(Animal motor);

    public int updateAnimal(Animal motor);

    public int deleteAnimal(int id);
}