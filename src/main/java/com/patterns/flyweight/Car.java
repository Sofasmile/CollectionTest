package com.patterns.flyweight;

public class Car implements Vehicle {
    private static final int WHEEL = 4;
    private static final String MESSAGE = "Car is moving with speed  %s. And it has  %s wheels";

    @Override
    public void move(int speed) {
        System.out.println(String.format(MESSAGE, speed, WHEEL));
    }
}
