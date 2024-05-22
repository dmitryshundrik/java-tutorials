package org.example.singleton;

/**
 * Одиночка — это порождающий паттерн проектирования, который гарантирует, что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа.
 */
public class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    private Singleton() {
    }
}
