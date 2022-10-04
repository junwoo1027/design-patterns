package com.example.designpatterns._01_creatinal_patterns._03_abstract_factory;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
