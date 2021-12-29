package com.project.Leetcode;

public class CountVowelSubstringsString {

    private static boolean checkVowel(String input){

        String vow = "aeiou";
        int[] vowels = new int[26];

        for (int i=0; i<vow.length(); i++){
            vowels[vow.charAt(i) - 'a']++;
        }

        for(char ch : input.toCharArray()){

            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                return false;
            }
            vowels[ch-'a']--;
        }

        for (int i=0; i<vowels.length; i++){
            if (vowels[i] > 0){
                return false;
            }
        }

        return true;
    }

    public static int countVowelSubstrings(String word) {

        int count=0;
        int n = word.length();

        for (int i = 0; i < n; i++) {

            for (int j=i; j < n; j++){

                String temp = word.substring(i,j+1);

                if (temp.length() >= 5 && checkVowel(temp)){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countVowelSubstrings("cuaieuouac"));
    }
}
