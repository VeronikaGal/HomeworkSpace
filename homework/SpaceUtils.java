package com.galeeva.homework;

public final class SpaceUtils {

    public SpaceUtils() {
    }

    public static double gravitationalForce(SpaceObject spaceObject1, SpaceObject spaceObject2) {
        return WithFreeFallAcceleration.Gravitation * (spaceObject1.getWeight() * spaceObject2.getWeight() / Math.pow(spaceObject1.getDiameter(), 2));
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }
}
