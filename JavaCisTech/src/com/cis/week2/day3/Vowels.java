package com.cis.week2.day3;


import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String S1=sc.nextLine();
        int count=0;
        S1=S1.toLowerCase();
        for(int i=0;i<=S1.length()-1;i++){
            if(S1.charAt(i)=='a' ||S1.charAt(i)=='e'||S1.charAt(i)=='i'||S1.charAt(i)=='o'||S1.charAt(i)=='u'){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
