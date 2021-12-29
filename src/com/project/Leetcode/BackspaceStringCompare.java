package com.project.Leetcode;

public class BackspaceStringCompare {

    private static String compare(String s){

        int left = 0;
        int right = s.length()-1;
        char current = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (left<=right){

            current = s.charAt(left);

            if (current != '#'){
                stringBuilder.append(current);
            } else {
                if (!stringBuilder.toString().isEmpty()) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
            }

            left++;
        }

        return stringBuilder.toString();
    }

    public static boolean backspaceCompare(String s, String t) {

        return compare(s).equals(compare(t));
    }

    public static void main(String[] args) {

        System.out.println(backspaceCompare("ab##","c#d#"));
    }
}
