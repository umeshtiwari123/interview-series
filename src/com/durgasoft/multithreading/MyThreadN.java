package com.durgasoft.multithreading;

public class MyThreadN extends Thread{

    DisplayTwo d;

    MyThreadN(DisplayTwo d){
        this.d = d;
    }

    public void run(){
        d.displayN();
    }
}
