package com.cis.week1;

//Create a class with a static variable of type int and a static method that returns an int.
public class StaticCall {

    private static int x;
   // write a static block to initialize the static variable by calling the static method.
    static {
        x=returnValue();
    }
    public static int returnValue(){
        return 4;
    }


}
