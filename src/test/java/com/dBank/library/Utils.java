package com.dBank.library;

public class Utils {
    public static void sleep(long msec){
        try{
            Thread.sleep(msec);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
