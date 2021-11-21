package com.galeeva.homework;

import static java.lang.Math.PI;

public class Star extends SpaceObject implements WithLuminosity {

    private final double radius;
    private final double weight;
    private final double temperature;

    public Star(double radius, double weight, double temperature) {
        this.radius = radius;
        this.weight = weight;
        this.temperature = temperature;
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
    public double getLuminosity() {
        return 4 * PI * Math.pow(radius, 2) * WithLuminosity.constStefanBolsman * temperature;
    }

    @Override
    public String toString() {
        return "Star{" +
                "radius=" + radius +
                ", weight=" + weight +
                ", temperature=" + temperature +
                '}';
    }
}
