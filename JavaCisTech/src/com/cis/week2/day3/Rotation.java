package com.cis.week2.day3;

public class Rotation {
    public static void main(String[] args) {
        String s1="J2eeSpringHibernateDatajpa";
        String s2="HibernateDatajpaJ2eeSpring";
        if(s1.length()!=s2.length()){
            System.out.println("Not Rotation Strings of each other");
        }
        s1=s1.concat(s2);
        if(s1.contains(s2)){
            System.out.println("These two Rotational strings");

        }


    }
}
