package org.example.factory;

import org.example.factorymethod.ProductA;
import org.example.factorymethod.ProductB;
import org.example.factorymethod.Product;

/**
 * Простая фабрика  — это класс, в котором есть один метод с большим условным оператором, выбирающим создаваемый продукт.
 * Этот метод вызывают с неким параметром, по которому определяется какой из продуктов нужно создать.
 */
public class Factory {
    public static Product getProduct(String type) {
        if ("Product A".equals(type)) {
            return new ProductA();
        } else if ("Product B".equals(type)) {
            return new ProductB();
        }
        throw new IllegalArgumentException("Неизвестный продукт: " + type);
    }
}
