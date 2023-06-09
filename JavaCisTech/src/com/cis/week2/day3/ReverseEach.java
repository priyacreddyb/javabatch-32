package com.cis.week2.day3;
public class ReverseEach {
    public static void main(String[] args) {
        String originalString="Sun Rises in the East";
        String[] words=originalString.split(" ");
        String reverse="";
        for(String s:words){
            String reversewords="";
            for(int i= s.length()-1;i>=0;i--){
                reversewords=reversewords+s.charAt(i);
            }
            reverse=reverse+reversewords+" ";
        }
        System.out.println(reverse);


    }
}
