package com.cis.week3.day2;

class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
public class UsingThread {
    public static void main(String[] args) {
        Thread1 r=new Thread1();
        Thread t=new Thread(r);
        t.start();
    }
}
