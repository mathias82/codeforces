package com.project.codeforces;

import java.util.Scanner;

public class DoNotBeDistracted {

    private static String checkWord(String input){

        int i=0;
        int j=input.length()-1;
        StringBuilder stringBuilder = new StringBuilder();

        while (i<=j){

            char temp = input.charAt(i);

            for (int m=0; m<stringBuilder.length(); m++){
                if (stringBuilder.charAt(m) == temp && input.charAt(i) != input.charAt(i-1)){
                    return "NO";
                }
            }
            stringBuilder.append(input.charAt(i));

            i++;
        }

        return "YES";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (scanner.hasNext()){

            scanner.next();

            String word = scanner.next();

            System.out.println(checkWord(word));

        }

    }
}
