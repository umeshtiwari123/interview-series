package com.singleton;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;

public class DBConnectionLazy {

    public static void main(String[] args) {

        DBConnection2 connection2 = DBConnection2.getInstance();


    }
}
