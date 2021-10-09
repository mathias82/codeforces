package com.project.codeforces;

import java.util.Scanner;

public class FootBall {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int index = 1;

        for (int i=0; i<input.length()-1; i++){

            if (input.charAt(i) != input.charAt(i+1)) {
                index=1;
            }else {
                index++;
            }

            if (index == 7){
                break;
            }
        }

        if (index == 7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
