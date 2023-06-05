package com.cis.week1;

public class ImplementingClass implements Vehicle,Vehicle1{
//    This is the implementation of the two interfaces Vehicle1 and Vehicle
//    having same abstract method


    @Override
    public void numberOfWheels() {
        System.out.println("This class is Implementing two different Interfaces having " +
                "same abstract methods ");
    }
}
