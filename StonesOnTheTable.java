package com.project.controller.codeforces;

import java.util.Scanner;

public class StonesOnTheTable {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        sc.nextLine();
        String colors = sc.next();
        int count = 0;

        for (int i=0; i<colors.length()-1; i++){

            if (colors.charAt(i) == colors.charAt(i+1)){
                count++;
            }

        }

        System.out.println(count);
    }
}
