package com.project.codeforces;

import java.util.Scanner;

public class AngryStudents {

    private static int makeThemAngry(int N, String input){

        int num = 0;

        if ("PPA".equals(input) || input.length() == 1 || "PA".equals(input))return num;

        StringBuilder stringBuilder = new StringBuilder(input);

        fun : while (N-- > 0) {

            int i = 0;
            boolean is = false;

            while (i < input.length() - 1) {

                if (stringBuilder.charAt(i) == 'A' && stringBuilder.charAt(i + 1) == 'P') {
                    stringBuilder.setCharAt(i + 1, 'A');
                    is=true;
                    i++;
                }

                i++;
            }

            if (is) {
                num++;
            }

            int j = 0;
            while (j<input.length()-1) {

                if (!stringBuilder.toString().contains("P") || !stringBuilder.toString().contains("AP")) {
                    break fun;
                }
                j++;
            }
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0){

            int N = scanner.nextInt();
            String input = scanner.next();
            System.out.println(makeThemAngry(N,input));
        }

    }
}
