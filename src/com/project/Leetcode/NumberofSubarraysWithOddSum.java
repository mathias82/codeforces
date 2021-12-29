package com.project.Leetcode;

public class NumberofSubarraysWithOddSum {

    public static int smallestEqual(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int i=0; i<nums.length; i++){

            if (i % 10 == nums[i]){
                min = Math.min(min,i);
            }


        }

        return min == 2147483647 ? -1 : min;
    }

    public static void main(String[] args) {

        System.out.println(smallestEqual(new int[]{0,1,2}));
    }
}
