package com.project.codeforces;

import java.util.Scanner;

public class QueueAtSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        int time = scanner.nextInt();
        char[] word = scanner.next().toCharArray();

        while (time>0){

            for (int i=0; i<word.length-1; i++){

                if (word[i] == 'B' && word[i+1]=='G'){
                    word[i] = 'G';
                    word[i+1] = 'B';
                    i++;
                }
            }

            time--;
        }

        System.out.println(word);
    }
}
