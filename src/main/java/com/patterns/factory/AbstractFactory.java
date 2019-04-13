package com.patterns.factory;

import com.patterns.factory.implementation.AsusDeviceFactory;
import com.patterns.factory.implementation.LenovoDeviceFactory;
import com.patterns.factory.implementation.TypeOfCompany;

public class AbstractFactory {
    public static DeviceFactory getFactory(TypeOfCompany company) {
        DeviceFactory factory = null;
        if (company == TypeOfCompany.LENOVO) {
            factory = new LenovoDeviceFactory();
        } else if (company == TypeOfCompany.ASUS) {
            factory = new AsusDeviceFactory();
        }
        return factory;
    }
}
