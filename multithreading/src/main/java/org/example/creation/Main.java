package org.example.creation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        /**
         * Каждый поток может вызвать метод join(), чтобы дождаться завершения другого потока перед своим продолжением.
         */
        thread1.join();
        thread2.start();


    }
}