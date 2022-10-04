package com.example.designpatterns._01_creatinal_patterns._02_factory_method;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
