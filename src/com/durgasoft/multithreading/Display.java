package com.durgasoft.multithreading;

public class Display {

    public synchronized void wish(String name)
    {
        for(int i=0;i<10;i++){
            System.out.print("Good Morning:");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}

class MyThread extends Thread{

    Display d;
    String name;
    MyThread(Display d, String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run(){
        d.wish(name);
    }
}

class SynchronizedDemo{

    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Yuvraj");
        MyThread t3 = new MyThread(d, "Kohli");
        MyThread t4 = new MyThread(d, "Raina");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
