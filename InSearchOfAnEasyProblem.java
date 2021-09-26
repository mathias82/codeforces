package com.project.controller.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InSearchOfAnEasyProblem {

    private static boolean check(List<Integer> input){

        for(int value : input){

            if (value == 1){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }

        if (check(list)){
            System.out.println("HARD");
        }else {
            System.out.println("EASY");
        }
    }
}
