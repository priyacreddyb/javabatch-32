package com.cis.week2.day3;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String s=new String("FizzBizz");
        String s1=new String("FiBizzzz");
        char s2[]=s.toCharArray();
        char s3[]=s1.toCharArray();
        if (s2.length!=s3.length){
            System.out.println("Not an anagram");
            System.exit(0);
        }
        Arrays.sort(s2);
        Arrays.sort(s3);
        for (int i=0;i<s2.length;i++) {
            if (s2[i] != s3[i])
                {
                    System.out.println("Not an Anagram");
                    System.exit(0);
                }
            }
        System.out.println("Anagram");
            System.exit(0);

        }

    }

