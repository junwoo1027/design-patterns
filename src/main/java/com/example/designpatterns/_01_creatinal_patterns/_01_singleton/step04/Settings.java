package com.example.designpatterns._01_creatinal_patterns._01_singleton.step04;

public class Settings {
    private static volatile Settings instance;

    private Settings() {}

    /**
     * double-checked locking
     *
     * @return
     */
    public static Settings getInstance() {
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
