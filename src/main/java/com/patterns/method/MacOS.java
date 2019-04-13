package com.patterns.method;

import lombok.ToString;

@ToString
public class MacOS implements Os {
    private String internetSite;

    public MacOS(String internetSite) {
        this.internetSite = internetSite;
        load(internetSite);
    }

    private void load(String internetSite) {
        System.out.println("MacOs: start loading from " + internetSite);
    }

    @Override
    public String getOs() {
        return "MacOs: installation of the system";
    }
}
