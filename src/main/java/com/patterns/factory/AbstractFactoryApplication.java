package com.patterns.factory;

import com.patterns.factory.implementation.TypeOfCompany;

public class AbstractFactoryApplication {
    public static void main(String[] args) {
        DeviceFactory factory = AbstractFactory.getFactory(TypeOfCompany.ASUS);
        Laptop laptop = factory.getLeptop();
        System.out.println(laptop.getLaptopPrice());
    }
}
