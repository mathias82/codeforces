package com.project.Leetcode;

public class MinimumIndexSumTwoLists {

    public static int right(int[] nums, int target) {

        int left = 0;
        int right=nums.length-1;
        int numRight=-1;

        while(left<=right){

            int mid = left + (right-left)/2;

            if(target == nums[mid]){

                numRight = mid;
                right = mid - 1;


            } else if(nums[mid] > target){

                right = mid - 1;

            } else {

                left = mid + 1;
            }
        }

        return numRight;
    }

    public  static int left(int[] nums, int target) {

        int left = 0;
        int right=nums.length-1;
        int numLeft=-1;

        while(left<=right){

            int mid = left + (right-left)/2;

            if(target == nums[target]){

                numLeft = mid;
                left = mid + 1;


            } else if(nums[mid] > target){

                right = mid - 1;

            } else {

                left = mid + 1;
            }
        }

        return numLeft;
    }

    public static int search(int[] nums, int target) {

        if(right(nums,target) == -1 && left(nums,target) == -1){
            return -1;
        }

        else if(right(nums,target) == -1 && left(nums,target) != -1){

            return left(nums,target);

        } else {

            return right(nums,target);

        }
    }

    public static void main(String[] args) {

        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
    }
}
