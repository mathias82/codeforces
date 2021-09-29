package com.project.codeforces;

import java.util.Scanner;

public class BearAndBigBrother {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int limak = scanner.nextInt();
        int bob = scanner.nextInt();
        int years = 0;

        while (true){

            limak = limak * 3;
            bob = bob * 2;
            years++;

            if (limak > bob){
                break;
            }
        }
        System.out.println(years);
    }
}
