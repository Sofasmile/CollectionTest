package com.patterns.flyweight;

public class Car implements Vehicle {
    private static final int WHEEL = 4;

    @Override
    public void move(int speed) {
        System.out.println("Car is moving with speed " + speed + ". And it has " + WHEEL + " wheels");
    }
}
