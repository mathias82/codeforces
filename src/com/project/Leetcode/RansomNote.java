package com.project.Leetcode;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        StringBuilder stringBuilder = new StringBuilder(ransomNote);

        int i=0;
        int j=magazine.length()-1;

        while (i<=j){

            if (stringBuilder.length() == 0){
                break;
            }
            int m=0;
            while (m<magazine.length()){

                if (stringBuilder.length() == 0){
                    break;
                }

                if (m<stringBuilder.length() && stringBuilder.charAt(m) == magazine.charAt(i)) {
                    stringBuilder.deleteCharAt(m);
                    break;
                }
                m++;
            }

            i++;
        }

        return stringBuilder.length() == 0;
    }

    public static void main(String[] args) {

        System.out.println(canConstruct("aa","aab"));
    }
}
