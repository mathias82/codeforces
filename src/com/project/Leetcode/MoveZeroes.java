package com.project.Leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int left=0;
        int right= nums.length-1;
        int temp=0;

        while (left<=right && temp<=right){

            if (nums[temp] != 0){
                int a = nums[left];
                nums[left] = nums[temp];
                nums[temp] = a;
                left++;
            }

            temp++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        moveZeroes(new int[]{0,0,1,1});
        System.out.println();
    }
}
