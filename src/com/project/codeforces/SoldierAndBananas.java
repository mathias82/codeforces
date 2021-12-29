package com.project.codeforces;

import java.util.Scanner;

public class SoldierAndBananas {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int k,n,w;
        int sum=0;
        int borrow=0;

        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();

        for (int i=1; i<=w; i++){

            sum += i * k;
        }

        if (sum > n){
            borrow = sum - n;
        }

        System.out.println(borrow);
    }
}
