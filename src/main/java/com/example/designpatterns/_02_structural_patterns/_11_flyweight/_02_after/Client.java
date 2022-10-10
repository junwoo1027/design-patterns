package com.example.designpatterns._02_structural_patterns._11_flyweight._02_after;

/**
 * 플라이웨티트 패턴: 객체를 가볍게 만들어 메모리 사용을 줄이는 패턴
 *
 * 장점
 *  - 애플리케이션에서 사용하는 메모리를 줄일 수 있다.
 *  단점
 *  - 코드의 복잡도가 증가한다.
 */
public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('k', "white", fontFactory.getFont("Nanum:12"));
        Character c2 = new Character('i', "white", fontFactory.getFont("Nanum:12"));
        Character c3 = new Character('m', "white", fontFactory.getFont("Nanum:12"));
    }
}
