package com.project.Leetcode;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {


    public static boolean checkInclusion(String s1, String s2) {

        int[] letters = new int[26];

        for (int i =0; i<s1.length(); i++){
            letters[s1.charAt(i) - 'a']++;
            letters[s2.charAt(i) - 'a']--;
        }

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(Arrays.toString(letters));

        for (int j=0; j<s2.length(); j++){

            if (j<s1.length() && letters[s2.charAt(j) - 'a'] == letters[s1.charAt(j) - 'a']){
                System.out.println(stringBuilder.append(s1.charAt(letters[s2.charAt(j) - 'a'])));
            }
        }

        System.out.println(Arrays.toString(letters));
        System.out.println(stringBuilder);
        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkInclusion("ab","eidbaooo"));
    }
}
