package com.patterns.factory.implementation;

import com.patterns.factory.Smartphone;

public class AsusSmartphone implements Smartphone {
    private static final long PRICE = 5_000;

    @Override
    public long getSmartphonePrice() {
        return PRICE;
    }
}
