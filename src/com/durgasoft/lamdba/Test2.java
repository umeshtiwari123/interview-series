package com.durgasoft.lamdba;

public class Test2 {
    public static void main(String[] args) {

        IntRef2 i2 = ()-> System.out.println("m1() implemented using lambda");

        i2.m1();
    }
}
