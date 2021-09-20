package com.project.controller.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextRound {


    public static int checkScoreParticipants(List<List<Integer>> input) {

        int score = input.get(0).get(1);
        int count = 0;

        if (input.size() == 1)return 0;

        for (int i=0; i<input.get(1).size(); i++){

            if (input.get(1).get(i) >= input.get(1).get(score-1) && input.get(1).get(i) != 0){
                count++;
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
        System.out.println(checkScoreParticipants(integerList));

        sc.close();
    }
}