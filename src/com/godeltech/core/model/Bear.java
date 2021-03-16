package com.godeltech.core.model;

public class Bear extends Animal {
    private String color;

    public Bear(String name, double weight, double lifetime, String color) {
        super(name, weight, lifetime);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void roar() {
        System.out.println("Bear says rrrrrrrrr");
    }

    @Override
    public String toString() {
        return "Bear: " +
                "name=" + getName() + " " +
                "weight=" + getWeight() + " " +
                "lifetime=" + getLifetime() + " " +
                "color='" + color;
    }
}
