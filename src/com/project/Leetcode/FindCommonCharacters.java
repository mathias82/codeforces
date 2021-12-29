package com.project.Leetcode;

import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {

    public static List<String> commonChars(String[] words) {

        int[] charArray = new int[26];

        for (char a : words[0].toCharArray()){
                charArray[a - 'a']++;
        }

        for (int i=1; i<words.length; i++){

            int count = 0;

            for (int j=1; j<words[i].length(); j++){

                if (charArray[words[i].charAt(j) - 'a'] == 1 && count <= words.length){

                    count++;
                    System.out.println(words[i].charAt(j));
                }
            }

        }

        System.out.println(Arrays.toString(charArray));
        return null;
    }

    public static void main(String[] args) {

        System.out.println(commonChars(new String[]{"bella","label","roller"}));
    }
}
