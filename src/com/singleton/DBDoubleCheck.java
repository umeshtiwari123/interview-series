package com.singleton;

public class DBDoubleCheck {

    private static volatile DBDoubleCheck check;

    private DBDoubleCheck(){

    }

    public static DBDoubleCheck getInstance(){
        if(check==null){
            synchronized (DBDoubleCheck.class){
                if(check==null){
                    check = new DBDoubleCheck();
                }
            }
        }
        return check;
    }
}
