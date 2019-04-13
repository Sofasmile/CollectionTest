package com.patterns.adapter;

public class AdapterAppliacation {
    public static void main(String[] args) {
        Car car = new CarAdapterFromTruck();
        car.move();
        car.stop();
    }
}
