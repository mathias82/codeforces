package com.project.Leetcode;

public class FindMinimumRotatedSortedArray {

    public static int findPeakElement(int[] nums) {

        if (nums.length == 0){
            return -1;
        }
        if (nums.length == 1){
            return 0;
        }
        int low = 0;
        int high = nums.length-1;

        while (low<high){

            int middle = low + (high-low)/2;
            int value = nums[middle];

            if (middle > 0 && value < nums[middle - 1]){
                return middle;

            }
            else if (value >= nums[low] && value <= nums[high]){
                low = middle + 1;
            } else {
                high = high - 1;
            }

        }

        return low;
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{3,4,3,2,1}));
    }
}
