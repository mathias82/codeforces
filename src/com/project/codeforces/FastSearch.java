package com.project.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class FastSearch {

    private static int fastSearch(int[] input, int x, int y){

        int right = input.length;
        int left = -1;

        while (left+1<right){

            int mid = left + ((right-left)/2);

            if (input[mid] < x){
                left = mid;
            } else {
                right = mid;
            }
        }

        int closeLeft = left;

        right = input.length;
        left = -1;

        while (left+1<right){

            int mid = left + ((right-left)/2);

            if (input[mid] <= y){
                left = mid;
            } else {
                right = mid;
            }
        }

        int closeRight = right-1;

        return closeRight-closeLeft;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] input = new int[n];

        int i=0;
        while (n-->0){
            input[i++] = scanner.nextInt();
        }

        int len = scanner.nextInt();

        Arrays.sort(input);

        while (len-->0){
            int left = scanner.nextInt();
            int right = scanner.nextInt();

            System.out.println(fastSearch(input,left,right));
        }

    }
}