package com.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightApplication {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicleFactory.getVehicle(VehicleType.BIKE));
        vehicles.add(vehicleFactory.getVehicle(VehicleType.CAR));
        vehicles.add(vehicleFactory.getVehicle(VehicleType.BUS));

        Random r = new Random();
        for (Vehicle vehicle : vehicles) {
            int speed = r.nextInt(85) + 15;
            vehicle.move(speed);
        }
    }
}
