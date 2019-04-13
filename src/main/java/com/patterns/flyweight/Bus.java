package com.patterns.flyweight;

public class Bus implements Vehicle {
    private static final int WHEEL = 8;
    private static final String MESSAGE = "Bus is moving with speed  %s. And it has  %s wheels";

    @Override
    public void move(int speed) {
        System.out.println(String.format(MESSAGE, speed, WHEEL));
    }
}
