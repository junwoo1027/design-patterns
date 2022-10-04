package com.example.designpatterns._01_creatinal_patterns._02_factory_method;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
