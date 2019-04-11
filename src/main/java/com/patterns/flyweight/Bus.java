package com.patterns.flyweight;

public class Bus implements Vehicle {
    private static final int WHEEL = 8;

    @Override
    public void move(int speed) {
        System.out.println("Bus is moving with speed " + speed + ". And it has " + WHEEL + " wheels");
    }
}
