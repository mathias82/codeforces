package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HolidayOfEquality {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }

        int max = Integer.MIN_VALUE;

        for (int i=0; i<list.size(); i++){
            if (max < list.get(i)){
                max = list.get(i);
            }
        }

        int count = 0;
        for (int j=0; j<list.size(); j++){

            if (list.get(j) < max){
                count += max - list.get(j);
            }
        }

        System.out.println(count);
    }
}
