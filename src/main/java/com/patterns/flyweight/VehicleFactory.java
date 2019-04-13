package com.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static final Map<VehicleType, Vehicle> VEHICLES = new HashMap<>();

    public Vehicle getVehicle(VehicleType kindOfVehicle) {
        Vehicle vehicle = VEHICLES.get(kindOfVehicle);
        if (vehicle == null) {
            switch (kindOfVehicle) {
                case BIKE:
                    vehicle = new Bike();
                    break;
                case BUS:
                    vehicle = new Bus();
                    break;
                case CAR:
                    vehicle = new Car();
                    break;
            }
            VEHICLES.put(kindOfVehicle, vehicle);
        }
        return vehicle;
    }
}
