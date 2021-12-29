package com.project.Leetcode;

public class VowelsOfAllSubstrings {

    private static long count(String input){

        int[] letters = new int[26];

        for (char temp : input.toCharArray()){

            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
                letters[temp - 'a']++;
            }
        }

        int count=0;
        for (int i=0; i<letters.length; i++){
            count += letters[i];
        }
        return count;
    }

    public static long countVowels(String word) {

        int n = word.length();
        long sum = 0;

        for (int i=0; i<n; i++){

            for (int j=i; j<n; j++){
                sum += count(word.substring(i,j+1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(countVowels("noosabasboosa"));
    }
}
