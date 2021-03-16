package com.godeltech.core.model;

public abstract class Animal {
    private String name;
    private double weight;
    private double lifetime;

    public Animal(String name, double weight, double lifetime) {
        this.name = name;
        this.weight = weight;
        this.lifetime = lifetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLifetime() {
        return lifetime;
    }

    public void setLifetime(double lifetime) {
        this.lifetime = lifetime;
    }

    public abstract void roar();
}
