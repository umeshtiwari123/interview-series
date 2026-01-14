package com.durgasoft.multithreading;

public class SynchronizedDisplayDemo {

    public static void main(String[] args) {

        DisplayTwo d = new DisplayTwo();

        MyThreadN n = new MyThreadN(d);

        MyThreadC c = new MyThreadC(d);

        c.start();
        n.start();




    }
}
