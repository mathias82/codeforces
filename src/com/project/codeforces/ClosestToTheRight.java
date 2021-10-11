package com.project.codeforces;

import java.util.Scanner;

public class ClosestToTheRight {

    private static int closestToTheRight(int[] input, int target){

        int right = input.length;
        int left = -1;

        while (left+1<right){

            int mid = left + ((right-left)/2);

            if (input[mid] < target){
                left = mid;
            } else {
                right = mid;
            }
        }

        return right+1;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] input = new int[n];

        int k=scanner.nextInt();

        int i=0;
        while (n-->0){
            input[i++] = scanner.nextInt();
        }

        while (k-->0){
            int target = scanner.nextInt();
            System.out.println(closestToTheRight(input,target));
        }

    }
}

