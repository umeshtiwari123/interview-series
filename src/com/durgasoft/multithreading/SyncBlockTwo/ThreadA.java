package com.durgasoft.multithreading.SyncBlockTwo;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException {

        ThreadB b = new ThreadB();
        b.start();
        Thread.sleep(5000);
        synchronized (b) {
            b.wait(10000);
        }
        System.out.println(b.total);


    }
}
