package com.example.designpatterns.singleton.step05;

public class Settings {
    private Settings() {}

    private static class SettingHolder {
        private static final Settings INSTANCE = new Settings();
    }

    /**
     * static inner 클래스
     *
     * @return
     */
    private static Settings getInstance() {
        return SettingHolder.INSTANCE;
    }
}
