package com.durgasoft.multithreading;

public class DisplayTwo {

    public  synchronized void displayN(){

        for (int i=1; i<=10;i++){
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
        }
    }

    public synchronized void displayC(){

        for(int i = 65; i<=75; i++){
            System.out.print((char) i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
        }

    }
}
