package com.project.controller.codeforces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DetermineLine {


    public static String determine(List<List<Integer>> input) {

        List<Integer> listCompare = new ArrayList<>(input.get(0));
        listCompare.remove(0);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<input.size(); i++){

            if (!input.get(i).isEmpty()) {
                input.get(i).remove(0);
            }
        }

        for (int i=1; i<input.size(); i++){
            for (int j=0; j<input.get(i).size(); j++){
                listCompare.retainAll(input.get(i));
            }
        }

        Set<Integer> set = new HashSet<>(listCompare);
        for (Integer value : set) {
            stringBuilder.append(value).append(" ");
        }

        return stringBuilder.toString().trim();
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
            System.out.println(determine(integerList));

        }
        sc.close();
    }
}