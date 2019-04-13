package com.patterns.factory;

public interface DeviceFactory {
    Laptop getLeptop();

    Smartphone getSmartphone();

    SmartWatch getSmartWatch();
}
