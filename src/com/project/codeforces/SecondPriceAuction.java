package com.project.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondPriceAuction {

    private static String checkBids(List<Integer> input){

        int max = Collections.max(input);
        int index = 0;
        int newMax=Integer.MIN_VALUE;

        for (int i=0; i<input.size(); i++){
            if (max == input.get(i)){
                index = i+1;
            }
            if (newMax < input.get(i) && max != input.get(i)){
                newMax = input.get(i);
            }
        }

        return index +" "+newMax;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        while (len-->0){
            list.add(scanner.nextInt());
        }

        System.out.println(checkBids(list));
    }
}
