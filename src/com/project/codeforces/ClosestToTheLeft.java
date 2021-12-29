package com.project.codeforces;

import java.util.Scanner;

public class ClosestToTheLeft {

    private static int closestToTheLeft(int[] input, int target){

        int right=input.length-1;
        int left=0;

        while (left<=right){

            int mid = left + ((right-left)/2);

            if (input[mid] <= target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
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
            System.out.println(closestToTheLeft(input,target));
        }

    }
}
