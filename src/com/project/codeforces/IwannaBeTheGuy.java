package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class IwannaBeTheGuy {

    private static String passAllLevels(Set<Integer> input,int n){

        for (int i=1; i<=n; i++){

            if (!input.contains(i)){
                return "Oh, my keyboard!";
            }
        }

        return "I become the guy.";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()){

            if (scanner.nextInt() > 0){
                String s = scanner.nextLine();
                Scanner sc = new Scanner(s);
                while (sc.hasNextInt()){
                    list.add(sc.nextInt());
                }
            }
        }

        Set<Integer> set = new TreeSet<>(list);

        System.out.println(passAllLevels(set,n));
    }
}
