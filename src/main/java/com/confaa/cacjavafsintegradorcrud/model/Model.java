package com.confaa.cacjavafsintegradorcrud.model;

import java.util.List;

public interface Model {
    public List<Animal> getAnimales() throws ClassNotFoundException;

    public Animal getAnimal(int id);

    public int addAnimal(Animal animal);

    public int updateAnimal(Animal animal);

    public int deleteAnimal(int id);
}