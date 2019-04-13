package com.patterns.method;

public class FactoryMethodApplication {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        Os os = factoryMethod.getCurrentOS(TypeOfOS.WINDOWS);
        System.out.println(os.getOs());
    }
}
