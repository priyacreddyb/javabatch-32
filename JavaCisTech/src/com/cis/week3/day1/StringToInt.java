package com.cis.week3.day1;

public class StringToInt {

    public static void ConvertToInt(String sNumber){
          try{
              int iNumber=Integer.parseInt(sNumber);
              System.out.println(iNumber);
          }catch (NumberFormatException e){
              System.out.println("Given String cannot be converted as a Integer");
          }
    }
    public static void main(String[] args) {
        String[] sNumber={"23","45.67","test","123f"};
        for(String s:sNumber){
            ConvertToInt(s);
        }
    }
}
