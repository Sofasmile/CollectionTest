package com.patterns.factory.implementation;

import com.patterns.factory.Laptop;

public class AsusLaptop implements Laptop {
    private static final long PRICE = 20_000;

    @Override
    public long getLaptopPrice() {
        return PRICE;
    }
}
