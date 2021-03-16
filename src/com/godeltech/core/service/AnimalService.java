package com.godeltech.core.service;

import com.godeltech.core.model.Animal;

public class AnimalService implements AnimalServiceImpl {
    public static void outputData(Animal animal) {
        System.out.println(animal.toString());
        animal.roar();
    }
}
