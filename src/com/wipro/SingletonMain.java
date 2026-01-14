package com.wipro;

import com.capgemini25Dec2025.L1.DBConnection;

public class SingletonMain {

    public static void main(String[] args) {
        DBConnection connection1 = DBConnection.getInstance();

        DBConnection connection2 = DBConnection.getInstance();

        DBConnection connection3 = DBConnection.getInstance();
        DBConnection connection4 = DBConnection.getInstance();
        DBConnection connection5 = DBConnection.getInstance();


        System.out.println(connection1);
        System.out.println(connection2);
        System.out.println(connection3);
        System.out.println(connection4);
        System.out.println(connection5);
        System.out.println(connection2);
    }
}
