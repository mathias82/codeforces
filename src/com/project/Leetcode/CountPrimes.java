package com.project.Leetcode;

public class CountPrimes {

    private static boolean isPrime(int n){

        for (int i = 2; i*i<=n; i++){

            if (n % i == 0){
                return false;
            }

        }
        return true;
    }

    public static int countPrimes(int n) {


        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = false;
        }

        int count = 0;
        for (int i=2; i<n; i++){

            if(isPrime(i)){
               isPrime[i] = true;
            }
        }

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countPrimes(10));
    }

}
