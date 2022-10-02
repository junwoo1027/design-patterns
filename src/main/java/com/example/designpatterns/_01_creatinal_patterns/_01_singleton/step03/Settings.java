package com.example.designpatterns._01_creatinal_patterns._01_singleton.step03;

public class Settings {
    private static final Settings INSTANCE = new Settings();

    private Settings() {}

    /**
     * 이른 초기화(eager initialization) 사용
     * 단점: 미리 생성하는 자체가 단점
     * @return
     */
    public static Settings getInstance() {
        return INSTANCE;
    }
}
