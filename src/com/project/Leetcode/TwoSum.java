package com.project.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;
        int temp=1;
        int sum = 0;
        int[] answer = new int[2];
        int j=0;

        while (left<=right && temp <= right) {

            sum += nums[left] + nums[temp];

            if (sum == target){
                answer[j++] = left;
                answer[j] = temp;
                break;
            }
            else if (temp == right){
                left++;
                temp = left+1;
                sum=0;
            }
            else {
                sum = 0;
                temp++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{3,2,3}, 6)));
    }
}
