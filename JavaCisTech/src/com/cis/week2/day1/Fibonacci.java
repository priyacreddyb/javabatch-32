package com.cis.week2.day1;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int last;
        System.out.print(first+"  "+second);
        for(int i=2;i<=n;i++){
             last=first+second;
             first=second;
             second=last;
            System.out.print(" "+last);

        }
    }
}
