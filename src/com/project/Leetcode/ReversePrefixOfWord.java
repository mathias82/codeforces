package com.project.Leetcode;

public class ReversePrefixOfWord {

    private static String revert(String input){

        char[] array = input.toCharArray();
        int start = 0;
        int end = array.length-1;

        while (start<=end){

            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        return new String(array);
    }

    public static String reversePrefix(String word, char ch) {

        String substring = word.substring(word.indexOf(word.charAt(0)), word.indexOf(ch) + 1);
        return revert(substring).equals("") ? word : revert(substring) + word.substring(word.indexOf(ch)+1);
    }

    public static void main(String[] args) {

        System.out.println(reversePrefix("xyxzxe",'z'));
    }
}
