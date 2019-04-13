package com.patterns.factory.implementation;

import com.patterns.factory.SmartWatch;

public class LenovoSmartWatch implements SmartWatch {
    private static final long PRICE = 500;

    @Override
    public long getSmartWatchPrice() {
        return PRICE;
    }
}
