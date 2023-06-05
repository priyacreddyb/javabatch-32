package com.cis.week1;

//Create a final class with a final variable and a final method that can only be accessed by classes within the same package.
 class AllFinal {
    //final variable
     final int finalVariable=99;

    //final method
     final int finalMethod(){
        System.out.println("This the final method");
        return 0;
    }
}
