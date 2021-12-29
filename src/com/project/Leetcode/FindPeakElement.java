package com.project.Leetcode;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {

        int low=0;
        int high=nums.length-1;

        while (low<high){

            int mid = low + (high-low)/2;

            if (nums[mid] < nums[mid+1]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high+1;
    }

    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}
