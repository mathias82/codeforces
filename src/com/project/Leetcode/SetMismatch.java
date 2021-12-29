package com.project.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SetMismatch {

    public static int[] findErrorNums(int[] nums) {


        int total = (nums.length + 1) * nums.length / 2;
        Map<Integer,Integer> map = new HashMap<>();
        int duplicate = 0;
        int sumWithOutDuplicate = 0;

        for (int i=0; i< nums.length; i++){

            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
                sumWithOutDuplicate += nums[i];
            } else {
                duplicate = nums[i];
            }
        }

        return new int[]{duplicate, total-sumWithOutDuplicate};
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findErrorNums(new int[]{1,1})));
    }
}
