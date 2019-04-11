package com.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static final Map<VehicleType, Vehicle> VEHICLES = new HashMap<>();

    public Vehicle getVehicle(VehicleType kindOfVehicle) {
        Vehicle vehicle = VEHICLES.get(kindOfVehicle);
        if (vehicle == null) {
            if (kindOfVehicle.equals(VehicleType.BIKE)) {
                vehicle = new Bike();
            } else if (kindOfVehicle.equals(VehicleType.BUS)) {
                vehicle = new Bus();
            } else if (kindOfVehicle.equals(VehicleType.CAR)) {
                vehicle = new Car();
            }
            VEHICLES.put(kindOfVehicle, vehicle);
        }
        return vehicle;
    }
}
