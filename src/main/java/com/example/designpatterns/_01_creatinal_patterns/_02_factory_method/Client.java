package com.example.designpatterns._01_creatinal_patterns._02_factory_method;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "junwoo1027@naver.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "junwoo1027@naver.com");
        System.out.println(blackShip);
    }
}
