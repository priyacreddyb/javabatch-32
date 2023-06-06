package com.cis.week2.day1;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args)
    {
        System.out.println("Enter the integer to be reversed:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int rem=0,reverse=0;
        while(n>0)
        {
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println("The reverse of the given integer is:"+reverse);
    }

}
