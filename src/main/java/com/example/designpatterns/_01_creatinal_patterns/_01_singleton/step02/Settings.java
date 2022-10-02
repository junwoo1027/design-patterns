package com.example.designpatterns._01_creatinal_patterns._01_singleton.step02;

public class Settings {
    private static Settings instance;

    private Settings() {}

    /**
     * synchronized 동기화
     * 단점: 메소드 호출 시 동기화 처리 비용
     * @return
     */
    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
