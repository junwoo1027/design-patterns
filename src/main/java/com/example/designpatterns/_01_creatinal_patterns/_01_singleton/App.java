package com.example.designpatterns._01_creatinal_patterns._01_singleton;

import com.example.designpatterns._01_creatinal_patterns._01_singleton.step05.Settings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.getInstance();

        /**
         * 리플렉션 사용하기
         */
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();

        System.out.println(settings == settings1);
    }
}
