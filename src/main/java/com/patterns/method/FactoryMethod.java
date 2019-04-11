package com.patterns.method;

public class FactoryMethod {
    private static final String PERFORMANCE = "hight";
    private static final String TYPE_OF_UI = "graphic";
    private static final String SITE = "www.apple.com";
    private static final boolean MULTITHREADING = true;
    private static final int BIT_DEPTH = 64;

    public Os getCurrentOS(TypeOfOS name) {
        Os os = null;
        if (name.equals(TypeOfOS.WINDOWS)) {
            os = new WindowsOS.Builder()
                    .setBitDepth(BIT_DEPTH)
                    .setMultithreading(MULTITHREADING)
                    .setPerformance(PERFORMANCE)
                    .setTypeOfUI(TYPE_OF_UI)
                    .build();
        } else if (name.equals(TypeOfOS.LINUX)) {
            os = LinuxOS.getInstance(MULTITHREADING, TYPE_OF_UI);
        } else if (name.equals(TypeOfOS.MAC)) {
            os = new ProxyMacOS(SITE);
        }
        return os;
    }
}
