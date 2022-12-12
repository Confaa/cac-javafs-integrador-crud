package com.confaa.cacjavafsintegradorcrud.model;

import java.util.ArrayList;
import java.util.List;

public class ModelHC implements Model {
    private List<Animal> animales;

    public ModelHC() {
        this.animales = new ArrayList<>();
    }

    @Override
    public List<Animal> getAnimales() {
        return this.animales;
    }

    @Override
    public Animal getAnimal(int id) {
        Animal animal = null;
        for (int i = 0; i < this.animales.size(); i++) {
            if (this.animales.get(i).getIdMascota() == id) {
                animal = this.animales.get(i);
            }
        }
        return animal;
    }

    @Override
    public int addAnimal(Animal animal) {
        this.animales.add(animal);
        return 0;
    }

    @Override
    public int updateAnimal(Animal animal) {
        Animal animalBuscado = getAnimal(animal.getIdMascota());
        int i = this.animales.indexOf(animalBuscado);
        this.animales.set(i, animal);
        return 0;
    }

    @Override
    public int deleteAnimal(int id) {
        Animal animalBuscado = getAnimal(id);
        this.animales.remove(animalBuscado);
        return 0;
    }
}
