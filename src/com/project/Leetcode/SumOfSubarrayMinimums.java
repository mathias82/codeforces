package com.project.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubarrayMinimums {

    public static int sumSubarrayMins(int[] arr) {

        int M = (int) 1e9 + 7;
        long answer = 0;

        for (int i=0; i<=arr.length; i++){

            for (int j=0; j<arr.length; j++){

                List<Integer> list = new ArrayList<>();

                for (int k=i; k<=j; k++){

                    list.add(arr[k]);
                }
                if (!list.isEmpty()){

                    answer += list.stream().min(Integer::compareTo).get();

                }
            }
        }

        return (int) (answer % M);
    }

    public static void main(String[] args) {

        System.out.println(sumSubarrayMins(new int[]{11,81,94,43,3}));
    }
}
