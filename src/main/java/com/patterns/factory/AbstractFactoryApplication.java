package com.patterns.factory;

import com.patterns.factory.implementation.AsusDeviceFactory;
import com.patterns.factory.implementation.LenovoDeviceFactory;

public class AbstractFactoryApplication {
    public static void main(String[] args) {
        String country = "Lenovo";
        DeviceFactory factory = null;
        if (country.equals("Lenovo")) {
            factory = new LenovoDeviceFactory();
        } else if (country.equals("Asus")) {
            factory = new AsusDeviceFactory();
        }

        Laptop laptop = factory.getLeptop();
        System.out.println(laptop.getLaptopPrice());
    }
}
