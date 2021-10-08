package com.project.codeforces;

import java.util.Scanner;

public class FakeNews {

    private static String checkIfHeidiExists(String input){


        char[] chars = {'h','e','i','d','i'};
        int i=0;
        int m=0;
        int j=input.length();

        while (i<j){

            if (chars[m] == input.charAt(i)){
                m++;
            }else {
                i++;
            }

            if (chars.length == m){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        System.out.println(checkIfHeidiExists(word));

    }
}
