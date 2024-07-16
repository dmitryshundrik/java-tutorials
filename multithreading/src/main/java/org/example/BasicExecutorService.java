package org.example;

import java.util.concurrent.*;

public class BasicExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("cringe...");
            }
        };

        executorService.submit(runnable);

        Callable<String> callable = new Callable() {
            @Override
            public String call() throws Exception {
                return "cringe callable...";
            }
        };

        Future<String> future = executorService.submit(callable);

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }
}
