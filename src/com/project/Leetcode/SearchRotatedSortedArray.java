package com.project.Leetcode;

public class SearchRotatedSortedArray {


    private static boolean findTheValue(int[] array, int target){

        int left = 0;
        int right = array.length-1;

        while (left<=right){

            int middle = left + (right - left)/2;

            if (array[middle] == target){
                return true;
            } else if(array[middle] < target){
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {


        for (int i=0 ; i<matrix.length; i++){

            if(findTheValue(matrix[i], target)){
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},60));
    }

}
