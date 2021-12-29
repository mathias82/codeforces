package com.project.Leetcode;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        for (int i= digits.length-1; i>=0; i--){

            if (digits[i] < 9){
                digits[i] += 1;

                return digits;
            }
            digits[i] = 0;
        }
        int[] answer = new int[digits.length+1];
        answer[0] = 1;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,9})));
    }
}
