package com.cis.week3.day1;

public class StringToInt {
    public static void main(String[] args) {
        String[] sNumber={"23","45.67","test","123f"};
        int iNumber;
        try {
            for(String s:sNumber){
            iNumber= Integer.parseInt(s);
            System.out.println(iNumber);
            }
        }catch (NumberFormatException e){
            System.out.println("Given String Cannot be converted as an Integer");
        }
    }
}
