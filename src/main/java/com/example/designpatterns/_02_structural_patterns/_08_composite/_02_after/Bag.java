package com.example.designpatterns._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public int getPrice() {
        return this.components.stream().mapToInt(Component::getPrice).sum();
    }
}
