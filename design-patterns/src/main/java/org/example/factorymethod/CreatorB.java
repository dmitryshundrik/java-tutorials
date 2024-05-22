package org.example.factorymethod;

public class CreatorB extends Creator {
    @Override
    Product factoryMethod() {
        return new ProductB();
    }
}
