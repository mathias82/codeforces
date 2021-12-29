package com.project.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        int i=0;
        int j=nums1.length-1;

        while (i<=j){

            int m=0;

            while (list.size() < nums2.length && m<nums2.length){

                if (nums1[i] == nums2[m]){
                    list.add(nums2[m]);
                    nums2[m] = -1;
                    break;
                }

                m++;
            }

            i++;
        }

        System.out.println(Arrays.toString(nums2));
        return list.stream().mapToInt(a -> a).toArray();
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1}, new int[]{2,2})));
    }
}
