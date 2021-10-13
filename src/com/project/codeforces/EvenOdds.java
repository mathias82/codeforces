package com.project.codeforces;

import java.util.Scanner;

public class EvenOdds {

    private  static long positionK(long n, long k){

        long mid = n/2;
        long answer = 1;

        if (n%2 == 1){
            mid++;
        }

        if (k <= mid){
            answer = (2*k)-1;
        } else {
            answer = (k - mid)*2;
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        System.out.println(positionK(n,k));
    }
}
