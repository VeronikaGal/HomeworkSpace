package com.galeeva.homework;

public class Planet extends SpaceObject implements WithFreeFallAcceleration {

    private final double radius;
    private final double weight;

    public Planet(double radius, double weight) {
        this.radius = radius;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getFreeFallAcceleration() {
        return Gravitation * (weight / Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Planet{" +
                "radius=" + radius +
                ", weight=" + weight +
                '}';
    }
}
