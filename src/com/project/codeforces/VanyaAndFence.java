package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VanyaAndFence {

    private static int printNum(List<List<Integer>> input){

        int height = input.get(0).get(1);
        int count=0;

        if (input.size() < 2){
            return 1;
        }

        for (int i = 0; i < input.get(1).size(); i++) {

                if (height >= input.get(1).get(i)) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }

        return count;
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        List<List<Integer>> integerList = new ArrayList<>();

        while (sc.hasNextInt()){

            String s = sc.nextLine();
            Scanner scanner = new Scanner(s);
            List<Integer> list = new ArrayList<>();

            while (scanner.hasNextInt()){
                list.add(scanner.nextInt());
            }

            integerList.add(list);
        }
        System.out.println(printNum(integerList));
        sc.close();
    }
}
