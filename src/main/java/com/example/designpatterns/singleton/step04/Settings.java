package com.example.designpatterns.singleton.step04;

public class Settings {
    private static volatile Settings instance;

    private Settings() {}

    /**
     * double-checked locking
     *
     * @return
     */
    private static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
