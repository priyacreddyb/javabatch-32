package com.cis.week2.day2;

public class Rotate {
    public static void main(String[] args) {
        int[] y={2,3,6,1,46,24,87};
        int N=y.length;
        int shift=2;
        for(int i=0;i<N;i++) {
            if (i < N - shift) {
                System.out.println(y[i + shift]);
            }
        }
        for(int i=0;i<shift;i++){
            System.out.println(y[i]);
        }
    }
}
