package com.singleton;

public class DBConnectionEager {

    public static void main(String[] args) {

        DBConnection connection = DBConnection.getInstance();
    }
}
