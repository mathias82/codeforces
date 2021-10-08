package com.project.codeforces;

import java.util.Scanner;

public class TwoBrackets {

    private static int checkMaxNum(String input){

        int count=0;

        int i=0;
        int j=input.length()-1;

        int t1=0;
        int t2=0;

        while (i<=j){

            char ch = input.charAt(i);

            if (ch == '('){
                t1++;
            }else if (ch == ')'){

                if (t1>0){
                    t1--;
                    count++;
                }
            } else if (ch == '['){
                t2++;
            }else if (ch == ']'){

                if (t2>0){
                    t2--;
                    count++;
                }
            }
            i++;
        }


        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        while (len-->0){

            String word = scanner.next();

            System.out.println(checkMaxNum(word));
        }

    }
}
