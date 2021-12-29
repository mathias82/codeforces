package com.project.codeforces;

import java.util.Scanner;

public class MishkaGame {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int countMis = 0;
        int countChris = 0;

        while (scanner.hasNextInt()){

            int misha = scanner.nextInt();
            int chris = scanner.nextInt();

            if (misha > chris){
                countMis++;
            }
            if (chris>misha){
                countChris++;
            }
        }

        if (countChris == countMis){
            System.out.println("Friendship is magic!^^");
            return;
        }

        if (countChris > countMis){
            System.out.println("Chris");
        }else {
            System.out.println("Mishka");
        }

        System.out.println(countChris);
        System.out.println(countMis);

    }
}
