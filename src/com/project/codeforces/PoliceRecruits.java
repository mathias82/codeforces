package com.project.codeforces;

import java.util.Scanner;

public class PoliceRecruits {

    private static int unTreated(int[] input){

        int i=0;
        int untreated=0;
        int current=0;

        while (i<input.length){

            int num = input[i];

            if (num > 0){
                current += num;

            } else {

                if (current < 1){
                    untreated++;
                }else {
                    current--;
                }

            }
            i++;
        }

        return untreated;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int i=0;

        while (len-- > 0){
            array[i++] = scanner.nextInt();
        }
        System.out.println(unTreated(array));
    }
}
