package org.example;

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        OuterClass.StaticNestedClass innerStaticClass = new OuterClass.StaticNestedClass();

        /* Анонимный внутренний класс */
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                /* Локальный вложенный класс */
                class LocalNestedClass {

                }
                LocalNestedClass localNestedClass = new LocalNestedClass();
            }
        });
    }
}