package com.project.Leetcode;

public class SecondLargestDigitInString {

    public static int secondHighest(String s) {

        int a = -1;
        int b = -1;

        for (char chars : s.toCharArray()){

            if (Character.isDigit(chars)){

                int x = Character.getNumericValue(chars);

                if (x > a){
                    b = a;
                    a = x;
                } else if (x > b){
                    b = x;
                }
            }

        }

        return b;
    }

    public static void main(String[] args) {

        System.out.println(secondHighest("sjhtz8344"));
    }

}
