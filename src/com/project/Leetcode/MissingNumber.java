package com.project.Leetcode;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int total = (nums.length + 1) * nums.length / 2;
        int sum = 0;

        for (int i=0; i<nums.length; i++){

            sum += nums[i];

        }

        return total-sum;
    }

    public static void main(String[] args) {

        System.out.println(missingNumber(new int[]{0,1}));

    }
}
//5,3,2,2,1