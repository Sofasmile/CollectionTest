package com.patterns.method;

public class FactoryMethod {
    private static final String PERFORMANCE = "hight";
    private static final String TYPE_OF_UI = "graphic";
    private static final String SITE = "www.apple.com";
    private static final boolean MULTITHREADING = true;
    private static final int BIT_DEPTH = 64;

    public Os getCurrentOS(TypeOfOS name) {
        Os os = null;
        switch (name) {
            case WINDOWS:
                os = new WindowsOS.Builder()
                        .setBitDepth(BIT_DEPTH)
                        .setMultithreading(MULTITHREADING)
                        .setPerformance(PERFORMANCE)
                        .setTypeOfUI(TYPE_OF_UI)
                        .build();
                break;
            case LINUX:
                os = LinuxOS.getInstance(MULTITHREADING, TYPE_OF_UI);
                break;
            case MAC:
                os = new ProxyMacOS(SITE);
                break;
        }
        return os;
    }
}
