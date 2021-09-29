package com.project.codeforces;

import java.util.Scanner;

public class UltraFastMathematician {

    private static String calculation(String first, String second){

        StringBuilder answer = new StringBuilder();

        for (int i=0; i<first.length() && i<second.length(); i++){

            if (first.charAt(i) == '1' && second.charAt(i) == '1' || first.charAt(i) == '0' && second.charAt(i) == '0'){
                answer.append("0");
            }else {
                answer.append("1");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        System.out.println(calculation(first,second));
    }
}

