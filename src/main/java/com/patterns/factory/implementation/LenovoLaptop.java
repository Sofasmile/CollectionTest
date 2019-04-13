package com.patterns.factory.implementation;

import com.patterns.factory.Laptop;

public class LenovoLaptop implements Laptop {
    private static final long PRICE = 15_000;

    @Override
    public long getLaptopPrice() {
        return PRICE;
    }
}
