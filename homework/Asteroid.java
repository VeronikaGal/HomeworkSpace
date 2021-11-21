package com.galeeva.homework;

public class Asteroid extends SpaceObject implements WithFreeFallAcceleration, WithOrbitPeriod {

    private final double radius;
    private final double weight;
    private final double orbitalSemis;

    public Asteroid(double radius, double weight, double orbitalSemis) {
        this.radius = radius;
        this.weight = weight;
        this.orbitalSemis = orbitalSemis;
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
    public double getOrbitPeriod() {
        return orbitalSemis * Math.sqrt(orbitalSemis);
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "radius=" + radius +
                ", weight=" + weight +
                ", orbitalSemis=" + orbitalSemis +
                '}';
    }
}
