package com.project.controller.codeforces;

import java.util.Scanner;

public class AmusingJoke {

    private static boolean canFind(String a, String b, String pileWord){

        int[] word = new int[26];
        pileWord = pileWord.toLowerCase();

        for (int i=0; i<pileWord.length(); i++){
            word[pileWord.charAt(i) - 'a']++;
        }

        a = a.toLowerCase();
        for (int i=0; i<a.length(); i++){
            word[a.charAt(i) - 'a']--;
        }

        b = b.toLowerCase();
        for (int i=0; i<b.length(); i++){
            word[b.charAt(i) - 'a']--;
        }

        for (int j=0; j<26; j++){

            if (word[j] != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String guestName = scanner.next();
        String residenceName = scanner.next();
        String pileDoorWord = scanner.next();

        if (canFind(guestName,residenceName,pileDoorWord)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
