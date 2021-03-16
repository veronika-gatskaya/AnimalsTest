package com.godeltech.core.model;

public class Snake extends Animal {
    private double length;

    public Snake(String name, double weight, double lifetime, double length) {
        super(name, weight, lifetime);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void roar() {
        System.out.println("Snake shipit. Shshshsh");
    }

    @Override
    public String toString() {
        return "Snake:" +
                "name=" + getName() + " " +
                "weight=" + getWeight() + " " +
                "lifetime=" + getLifetime() + " " +
                "length=" + length;
    }
}
