package com.patterns.flyweight;

public class Bike implements Vehicle {
    private static final int WHELL = 2;

    @Override
    public void move(int speed) {
        System.out.println("Bike is moving with speed " + speed + ". And it has " + WHELL + " wheels");
    }
}
