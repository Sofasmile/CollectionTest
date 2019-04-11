package com.patterns.factory.implementation;

import com.patterns.factory.Smartphone;

public class LenovoSmartphone implements Smartphone {
    private static final long PRICE = 2_000;

    @Override
    public long getSmartphonePrice() {
        return PRICE;
    }
}
