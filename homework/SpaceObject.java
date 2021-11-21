package com.galeeva.homework;

public abstract class SpaceObject {

    public boolean isWeightEqual(SpaceObject spaceObject) {
        return getWeight() == spaceObject.getWeight();
    }

    public abstract double getWeight();

    public abstract double getDiameter();

}
