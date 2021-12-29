package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerejaAndDima {

    private static String numbers(List<Integer> input){

        int sereja=0;
        int dima=0;
        int currentTime=0;
        int j=input.size()-1;
        int i=0;


        while (i<=j) {

            if (input.get(i) > input.get(j)) {

                if (currentTime == 0) {
                    sereja += input.get(i);
                    currentTime = 1;
                } else {
                    dima += input.get(i);
                    currentTime = 0;
                }
                i++;
            }else {

                if (currentTime == 0) {
                    sereja += input.get(j);
                    currentTime = 1;
                } else {
                    dima += input.get(j);
                    currentTime = 0;
                }
                j--;
            }

        }


        return sereja+" "+dima;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        List<Integer> array = new ArrayList<>();

        while (len-- > 0){
            array.add(scanner.nextInt());
        }

        System.out.println(numbers(array));
    }

}
