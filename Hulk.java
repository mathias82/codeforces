package com.project.controller.codeforces;

import java.util.Scanner;

public class Hulk {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int index=1;
        int input=sc.nextInt();

        while (index<=input) {

            if (index % 2 != 0){
                System.out.print(" I hate");
            }
            else {
                System.out.print(" I love");
            }

            if (index<input){
                System.out.print(" that");
            }
            index++;
        }

        System.out.print(" it");
    }
}

