package com.project.controller.codeforces;


import java.util.Scanner;

public class Elephant {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int answer = x%5 == 0 ? x/5 : x/5 + 1;
        System.out.println(answer);
    }
}
