package com.project.Leetcode;

public class LongestPalindromicSubstring {

    private static boolean isPalindrome(String input){

        int left=0;
        int right=input.length()-1;

        while (left<=right){

            if (input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static String longestPalindrome(String s) {

        String answer = "";
        int n = s.length();
        int max = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){

            for (int j=i; j<n; j++){

                String a = s.substring(i,j+1);

                if (isPalindrome(a) && max < a.length()){
                    max = a.length();
                    answer = a;
                }

            }

        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("babad"));

    }
}
