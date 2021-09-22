package com.project.controller.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tram {

    private static int calculatePassengers(List<Integer> input){

        List<Integer> enter = new ArrayList<>();
        List<Integer> exit = new ArrayList<>();
        int a = 0;
        int b = 0;
        int max = 0;
        int c = 0;

        for (int i=1; i<input.size()-1; i++){

            if (i%2==0){

                exit.add(input.get(i));

            }else {
                enter.add(input.get(i));
            }
        }

        for (int i=0; i<enter.size(); i++){

            a = enter.get(i) + c;
            b = exit.get(i);
            c = a-b;

            max = Math.max(max,a);
        }

        return max;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        sc.next();

        while (sc.hasNextInt()){

            String s = sc.nextLine();
            Scanner scanner = new Scanner(s);

            while (scanner.hasNextInt()){

                integerList.add(scanner.nextInt());
            }

        }

        System.out.println(calculatePassengers(integerList));


    }

}
