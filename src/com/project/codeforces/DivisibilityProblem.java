package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibilityProblem {

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


        for (int i=0; i<integerList.size(); i++){

            int first = integerList.get(i).get(0);
            int second = integerList.get(i).get(1);

            if (first % second == 0){

                System.out.println(0);

            }else {

                System.out.println(second-first%second);
            }
        }

        sc.close();
    }
}