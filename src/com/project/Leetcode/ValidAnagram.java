package com.project.Leetcode;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        StringBuilder point = new StringBuilder(t);

        int right = t.length()-1;
        int left=0;

        while (left<=right){

            int m=0;

            while (m<point.length()){

                if (s.charAt(left) == point.charAt(m)){
                    point.deleteCharAt(m);
                    break;
                }
                m++;
            }

            if (point.length() == 0){
                return true;
            }

            left++;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
