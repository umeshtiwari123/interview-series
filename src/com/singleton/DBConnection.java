package com.singleton;

public class DBConnection {

    private static final DBConnection connection = new DBConnection();

    private DBConnection(){
        System.out.println("Singleton Example with Eager Initialization");
    }

    public static DBConnection getInstance(){
        return connection;
    }
}




