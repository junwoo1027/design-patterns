package com.example.designpatterns._01_creatinal_patterns._01_singleton.step01;

public class Settings {
    private static Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
