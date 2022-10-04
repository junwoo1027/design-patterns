package com.example.designpatterns._01_creatinal_patterns._04_builder;

/**
 * 빌더 패턴
 * 장점
 *  - 복잡한 객체를 순차적으로 만들 수 있는 방법을 제공
 * 단점
 *  - 구조가 조금 복잡해질 수 있다.
 */
public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.japanTrip();
        TourPlan tourPlan1 = director.seoulTrip();
    }
}
