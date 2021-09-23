package com.project.controller.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrivalOfTheGeneral {

    private static int maxMin(List<Integer> input) {

        Integer[] ints = input.stream().toArray(Integer[]::new);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        int count=0;

        for (int i=0; i<ints.length; i++){

            if (max < ints[i]){
                max = ints[i];
                maxIndex = i;
            }
        }

        for (int i=maxIndex; i>=0; i--){

            if (ints[i] < max){
                int temp = ints[i];
                ints[i] = ints[i+1];
                ints[i+1] = temp;
                count++;
            }
        }

        for (int i=0; i<ints.length; i++){

            if (min >= ints[i]){
                min = ints[i];
                minIndex = i;
            }
        }

        for (int j=minIndex; j<ints.length-1; j++){

            if (ints[j] <= min){
                int temp = ints[j];
                ints[j] = ints[j+1];
                ints[j+1] = temp;
                count++;
            }
        }
       return count;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        sc.nextLine();

        while (sc.hasNextInt()){

            String s = sc.nextLine();
            Scanner scanner = new Scanner(s);

            while (scanner.hasNextInt()){
                integerList.add(scanner.nextInt());
            }
        }

        System.out.println(maxMin(integerList));
    }
}
