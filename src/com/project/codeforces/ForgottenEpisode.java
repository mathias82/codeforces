package com.project.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ForgottenEpisode {

    public static int forgottenEpisode(List<Integer> input, Integer num) {

        Collections.sort(input);
        int answer = 0;

        for (int i=1; i<=input.size(); i++){

            if (input.get(i-1) != i){

                 answer = i;
                 break;
            }

        }

        if (!input.get(input.size() - 1).equals(num)){

            return num;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        int num = sc.nextInt();


        while (sc.hasNextInt()){

            String s = sc.nextLine();
            Scanner scanner = new Scanner(s);


            while (scanner.hasNextInt()){

                integerList.add(scanner.nextInt());
            }
            scanner.close();
        }

        System.out.println(forgottenEpisode(integerList,num));

        sc.close();



    }

}

