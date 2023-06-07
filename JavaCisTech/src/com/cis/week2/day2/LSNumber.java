package com.cis.week2.day2;

public class LSNumber {

    public static void main(String[] args) {
        int[] x={1,2,4,3,6,45,43,56};
        int largest=x[0];
        int smallest=x[0];
        for(int i=0;i<=x.length-1;i++){
            int constant=x[i];
            if(constant>largest)
                largest=constant;
            if(constant<smallest)
                smallest=constant;
        }
        System.out.println("largest:"+largest);
        System.out.println("smallest:"+smallest);


    }
}






