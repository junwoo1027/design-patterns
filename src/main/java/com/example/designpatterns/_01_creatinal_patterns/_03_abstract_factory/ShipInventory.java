package com.example.designpatterns._01_creatinal_patterns._03_abstract_factory;

import com.example.designpatterns._01_creatinal_patterns._02_factory_method.Ship;
import com.example.designpatterns._01_creatinal_patterns._02_factory_method.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
