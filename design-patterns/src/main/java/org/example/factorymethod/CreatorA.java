package org.example.factorymethod;

public class CreatorA extends Creator {
    @Override
    Product factoryMethod() {
        return new ProductA();
    }
}
