package com.project.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {


    public static int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> count1 = new HashMap<>();

        for (int i=0; i<nums1.length; i++){

            if (!count1.containsKey(nums1[i])){
                count1.put(nums1[i],1);
            } else {
                count1.put(nums1[i], count1.get(nums1[i])+1);
            }
        }

        for (int i=0; i<nums2.length; i++){

            if (count1.containsKey(nums2[i])){
                if (count1.get(nums2[i]) > 0) {
                    count1.put(nums2[i], count1.get(nums2[i]) - 1);

                    if (!list.contains(nums2[i])) {
                        list.add(nums2[i]);
                    }
                }
            }


        }

        int[] answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));

    }
}
