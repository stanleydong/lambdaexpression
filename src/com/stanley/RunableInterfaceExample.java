package com.stanley;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunableInterfaceExample {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i++ < 10) {
                    System.out.println("It works as a normal runable!");
                }
            }
        };

        Runnable runnableLambda = () -> {
            int i = 0;
            while (i++ < 10) {
                System.out.println("It works as a lambda runable!");
            }
        };

        Executors.newSingleThreadExecutor().execute(r);
        Executors.newSingleThreadExecutor().execute(runnableLambda);
    }
}
