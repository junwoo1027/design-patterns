package com.example.designpatterns.singleton.step01;

public class Settings {
    private static Settings instance;

    private Settings() {}

    private static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
