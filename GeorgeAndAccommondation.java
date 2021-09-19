package com.project.controller.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeorgeAndAccommondation {

    private static int checkListNum(List<List<Integer>> input){

        int count = 0;

        for (int i=0; i<input.size(); i++){

            if (input.get(i).get(1) - input.get(i).get(0) >= 2){

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        List<List<Integer>> integerList = new ArrayList<>();
        sc.nextLine();

        while (sc.hasNextInt()){

            String s = sc.nextLine();
            Scanner scanner = new Scanner(s);
            List<Integer> list = new ArrayList<>();

            while (scanner.hasNextInt()){
                list.add(scanner.nextInt());
            }

            integerList.add(list);
            scanner.close();
        }
        System.out.println(checkListNum(integerList));
        sc.close();
    }
}
