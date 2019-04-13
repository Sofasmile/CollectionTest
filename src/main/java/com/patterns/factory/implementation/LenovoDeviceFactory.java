package com.patterns.factory.implementation;

import com.patterns.factory.DeviceFactory;
import com.patterns.factory.Laptop;
import com.patterns.factory.SmartWatch;
import com.patterns.factory.Smartphone;

public class LenovoDeviceFactory implements DeviceFactory {
    @Override
    public Laptop getLeptop() {
        return new LenovoLaptop();
    }

    @Override
    public Smartphone getSmartphone() {
        return new LenovoSmartphone();
    }

    @Override
    public SmartWatch getSmartWatch() {
        return new LenovoSmartWatch();
    }
}
