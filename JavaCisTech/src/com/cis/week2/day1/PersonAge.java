package com.cis.week2.day1;

import java.util.Scanner;

public class PersonAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person age:");
        int age = sc.nextInt();

        if (age >= 13 && age <= 19) {
            System.out.println("teen");;
        } else if (age < 13) {
            System.out.println("kid");;
        } else if (age > 19) {
            System.out.println("adult");;
        }

    }
}
