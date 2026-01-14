package com.singleton;

import java.util.SortedMap;

public class DBConnection2 {

    private static DBConnection2 connection2;

    private DBConnection2(){
        System.out.println("Singleton Design Pattern with Lazy Initialization");
    }

    public static synchronized DBConnection2 getInstance(){
        if(connection2==null){
            connection2 = new DBConnection2();
        }
        return connection2;
    }
}
