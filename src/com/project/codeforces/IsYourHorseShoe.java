package com.project.codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IsYourHorseShoe {

    private static int howDoublesShoes(List<Integer> input){

        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for (int i=0; i<input.size(); i++){

            if (!map.containsKey(input.get(i))){
                map.put(input.get(i),1);
            } else {

               count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }

        System.out.println(howDoublesShoes(list));

    }
}
