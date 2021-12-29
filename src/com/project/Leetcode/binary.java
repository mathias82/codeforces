package com.project.Leetcode;

public class binary {

    public static void printBinary(int n){

        StringBuilder str = new StringBuilder();

        while(n != 0){

            int temp = n % 2;
            n = n / 2;

            str.append(temp);

        }

        String answer = "";
        for(int i=str.length()-1; i>=0; i--){

            answer += str.charAt(i);

        }

        System.out.println(answer);

    }

    public static void main(String[] args) {

        printBinary(8);
    }
}
