package com.patterns.adapter;

public class CarAdapterFromTruck extends TruckCar implements Car {
    @Override
    public void move() {
        truckMove();
    }

    @Override
    public void stop() {
        truckStop();
    }
}
