package com.galeeva.homework;

public class Satellite extends SpaceObject implements WithSpeed {

    private final double radius;
    private final double weight;
    private final double high;

    public Satellite(double radius, double weight, double high) {
        this.radius = radius;
        this.weight = weight;
        this.high = high;
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
    public double getSpeed() {
        return Math.sqrt(WithFreeFallAcceleration.Gravitation * (weight / radius + high));
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "radius=" + radius +
                ", weight=" + weight +
                ", high=" + high +
                '}';
    }
}
