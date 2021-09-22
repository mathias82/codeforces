package com.project.controller.codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IsYourHorseShoe {

    private static int howDoublesShoes(List<Integer> input){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<input.size(); i++){

            if (!map.containsKey(input.get(i))){
                map.put(input.get(i),1);
            } else {

                map.put(input.get(i),map.get(input.get(i))+1);
            }
        }

        int count=0;
        for (int values : map.values()){

            while (values > 1){
                count++;
                values--;
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
