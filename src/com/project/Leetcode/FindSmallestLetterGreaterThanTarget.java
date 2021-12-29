package com.project.Leetcode;

public class FindSmallestLetterGreaterThanTarget {

    public static char nextGreatestLetter(char[] letters, char target) {

        int low = 0;
        int high = letters.length-1;

        while (low<=high){

            int mid = low + (high-low)/2;

            if (target < letters[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low >= letters.length ? letters[letters.length-1] : letters[low];
    }

    public static void main(String[] args) {

        System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'j'));
    }


}
