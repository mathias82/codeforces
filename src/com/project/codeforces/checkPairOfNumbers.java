package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class checkPairOfNumbers {

    private static List<Integer> checkNum(int[] input, List<Integer> list, int target){

        int right = input.length-1;
        int left = 0;

        while (left<=right){

            int mid = left + ((right-left)/2);

            if (mid > 0 && input[mid] == input[mid-1] && !list.contains(input[mid])){
                list.add(input[mid]);
            } else if (input[mid] > target){
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] input = new int[len];
        int i=0;

        while (len-- > 0){
            input[i++] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        for (int j=0; j<input.length; j++) {
            list = checkNum(input, list, input[j]);
        }
        System.out.println(list);
    }


}
