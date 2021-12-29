package com.project.Leetcode;

public class FibonacciNumber {

    public static long memoization[]=new long[26];

    public static int fib(int n) {

        int fibValue=0;

        if (n == 0){
            return 0;
        }
        else {
            fibValue = fib(n - 1) + fib(n - 2);
            memoization[n] = fibValue;
        }
        return fibValue;
    }

    public static void main(String[] args) {

        System.out.println(fib(4));
    }
}
