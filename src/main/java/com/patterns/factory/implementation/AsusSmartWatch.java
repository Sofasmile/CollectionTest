package com.patterns.factory.implementation;

import com.patterns.factory.SmartWatch;

public class AsusSmartWatch implements SmartWatch {
    private static final long PRICE = 1_000;

    @Override
    public long getSmartWatchPrice() {
        return PRICE;
    }
}
