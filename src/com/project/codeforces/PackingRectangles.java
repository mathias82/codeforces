package com.project.codeforces;

import java.util.Scanner;

public class PackingRectangles {

    static long w = 0;
    static long h = 0;
    static long n = 0;

    private static boolean good(final long w,final long h,final long x){

        return (x / w) * (x / h) >= n;
    }

    private static long packing(long w, long h, long n){

        long right = 1;
        long left = 0;

        while (!good(w,h,right)) right*=2;

        while (left+1<right){

            long mid =(left+right)/2;

            if (good(w,h,mid)){
                right = mid;
            } else {
                left = mid;
            }

        }

        return right;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        w = scanner.nextInt();
        h = scanner.nextInt();
        n = scanner.nextInt();

        System.out.println(packing(w,h,n));

    }

}
