package com.patterns.method;

public class ProxyMacOS implements Os {
    private String internetSite;
    private MacOS macOS;

    public ProxyMacOS(String internetSite) {
        this.internetSite = internetSite;
    }

    @Override
    public String getOs() {
        if (macOS == null) {
            macOS = new MacOS(internetSite);
        }
        return macOS.getOs();
    }
}
