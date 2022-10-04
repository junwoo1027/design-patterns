package com.example.designpatterns._01_creatinal_patterns._03_abstract_factory;

import com.example.designpatterns._01_creatinal_patterns._02_factory_method.Ship;
import com.example.designpatterns._01_creatinal_patterns._02_factory_method.ShipFactory;
import com.example.designpatterns._01_creatinal_patterns._02_factory_method.WhiteShip;

public class WhiteShipFactory implements ShipFactory {
    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        WhiteShip ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
