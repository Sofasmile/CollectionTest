package com.patterns.method;

import lombok.ToString;

@ToString
public class WindowsOS implements Os {
    private int bitDepth;
    private boolean isMultithreading;
    private String typeOfUI;
    private String performance;

    public static class Builder {
        private WindowsOS windowsOS;

        public Builder() {
            windowsOS = new WindowsOS();
        }

        public Builder setBitDepth(int bitDepth) {
            windowsOS.bitDepth = bitDepth;
            return this;
        }

        public Builder setMultithreading(boolean multithreading) {
            windowsOS.isMultithreading = multithreading;
            return this;
        }

        public Builder setTypeOfUI(String typeOfUI) {
            windowsOS.typeOfUI = typeOfUI;
            return this;
        }

        public Builder setPerformance(String performance) {
            windowsOS.performance = performance;
            return this;
        }

        public WindowsOS build() {
            return windowsOS;
        }
    }

    @Override
    public String getOs() {
        return this.toString();
    }
}
