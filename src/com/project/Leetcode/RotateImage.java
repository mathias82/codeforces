package com.project.Leetcode;

import java.util.Arrays;

public class RotateImage {

    private static void revert(int[] array){

        int left=0;
        int right=array.length-1;

        while (left<=right){

            int temp = array[right];
            array[right] = array[left];
            array[left] = temp;

            left++;
            right--;
        }

    }

    public static void rotate(int[][] matrix) {

        int[][] answer = new int[matrix.length][matrix.length];

        for (int i=0; i<matrix.length; i++){

            for (int j=0; j<matrix[i].length; j++){
                answer[i][j] = matrix[j][i];
            }
            revert(answer[i]);
        }
        System.out.println();
        for (int i=0; i<answer.length; i++){
            for (int j=0; j<answer[i].length; j++){
                matrix[i][j] = answer[i][j];
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {

        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
