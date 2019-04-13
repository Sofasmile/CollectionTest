package com.patterns.flyweight;

public class Bike implements Vehicle {
    private static final int WHELL = 2;
    private static final String MESSAGE = "Bike is moving with speed  %s. And it has  %s wheels";

    @Override
    public void move(int speed) {
        System.out.println(String.format(MESSAGE, speed, WHELL));
    }
}
