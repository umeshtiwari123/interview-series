package com.durgasoft.multithreading;

public class MyThreadC extends Thread{

    DisplayTwo d;

    MyThreadC(DisplayTwo d){

        this.d = d;
    }

    public void run(){
        d.displayC();
    }
}
