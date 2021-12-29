package com.project.Leetcode;

public class TribonacciNumber {

    static int[] array = new int[501];

    public static int tribonacci(int n){

        int temp = 0;

        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else if (n == 2){
            return 1;
        } else if (array[n] != 0){
            return array[n];
        }
        else {
            temp = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
            array[n] = temp;
            return temp;
        }

    }

    public static void main(String[] args) {

        System.out.println(tribonacci(500));
    }
}
