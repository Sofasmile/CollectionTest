package com.patterns.method;

import lombok.ToString;

@ToString
public class LinuxOS implements Os {
    private boolean isMultithreading;
    private String typeOfUI;
    private static LinuxOS instance = null;

    private LinuxOS(boolean multithreadin, String typeOfUI) {
        this.isMultithreading = multithreadin;
        this.typeOfUI = typeOfUI;
    }

    public static LinuxOS getInstance(boolean multithreadin, String typeOfUI) {
        if (instance == null) {
            instance = new LinuxOS(multithreadin, typeOfUI);
        }
        return instance;
    }

    @Override
    public String getOs() {
        return this.toString();
    }
}
