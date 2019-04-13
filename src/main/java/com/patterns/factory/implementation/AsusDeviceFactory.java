package com.patterns.factory.implementation;

import com.patterns.factory.DeviceFactory;
import com.patterns.factory.Laptop;
import com.patterns.factory.SmartWatch;
import com.patterns.factory.Smartphone;

public class AsusDeviceFactory implements DeviceFactory {
    @Override
    public Laptop getLeptop() {
        return new AsusLaptop();
    }

    @Override
    public Smartphone getSmartphone() {
        return new AsusSmartphone();
    }

    @Override
    public SmartWatch getSmartWatch() {
        return new AsusSmartWatch();
    }
}
