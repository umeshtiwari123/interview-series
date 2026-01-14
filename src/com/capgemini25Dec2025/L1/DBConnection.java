package com.capgemini25Dec2025.L1;

public class DBConnection {

    private static final DBConnection connObject = new DBConnection();

    private DBConnection(){
        System.out.println("Eager Initialization of Singleton class");
    }


    public static DBConnection getInstance(){
        return connObject;
    }
}
