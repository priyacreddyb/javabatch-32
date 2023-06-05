package com.cis.week1;

public class Child1 extends Parent1{

//    Create a constructor in child class to initialize both the instance variables.

    public Child1(int instance1,int instance2){
        super(instance1);
        this.instance2=instance2;

    }
    //    Create an overloaded constructor that takes only one parameter and initializes child class instance variable.

    public Child1(int instance2){
        super(0);
        this.instance2=instance2;

    }

    int instance2;

    public int getInstance2() {
        return instance2;
    }

    public void setInstance2(int instance2) {
        this.instance2 = instance2;
    }
}
