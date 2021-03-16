package com.godeltech.core.model;

public class Cat extends Animal {
    private String color;
    private String tailLength;

    public Cat(String name, double weight, double lifetime, String color, String tailLength) {
        super(name, weight, lifetime);
        this.color = color;
        this.tailLength = tailLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public void roar() {
        System.out.println("Cat says MEOW");
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name=" + getName() + " " +
                "weight=" + getWeight() + " " +
                "lifetime=" + getLifetime() + " " +
                "color=" + color + " " +
                "tailLength=" + tailLength;
    }
}
