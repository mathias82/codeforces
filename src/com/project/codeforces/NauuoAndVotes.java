package com.project.codeforces;

import java.util.Scanner;

public class NauuoAndVotes {

    private static String votes(int a, int b, int uncertain){

        int current=0;

        if (a==b){

            if (current < uncertain){
                return "?";
            }
            return "0";
        }

        if (a>b){
            current = a - b;
            if (current <= uncertain){
                return "?";
            }
            return "+";
        }

        if (b>a){
            current = b - a;
            if (current <= uncertain){
                return "?";
            }
            return "-";
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(votes(a,b,c));

    }
}
