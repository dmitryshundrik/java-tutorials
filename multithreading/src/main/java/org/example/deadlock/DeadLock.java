package org.example.deadlock;

public class DeadLock {
    public static void main(String[] args) {
        Object1 object1 = new Object1();
        Object2 object2 = new Object2();

        Thread thread1 = new Thread(() -> {
            synchronized (object1) {
                System.out.println("Thread1 acquired Object1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (object2) {
                    System.out.println("Thread1 acquired Object2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (object2) {
                System.out.println("Thread2 acquired Object2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (object1) {
                    System.out.println("Thread2 acquired Object1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
