package com.project.codeforces;

import java.util.*;

public class RestoreThePermutation {

    private static StringBuilder restorePerm(List<Integer> input){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<input.size(); i++){

            for (int j=i+1; j<input.size(); j++){

                if (Objects.equals(input.get(i), input.get(j))){
                    stringBuilder.append(input.get(i)).append(" ");
                    break;
                }
            }
        }
        return stringBuilder;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (scanner.hasNextInt()){

            scanner.nextLine();


            String s = scanner.nextLine();
            Scanner sc = new Scanner(s);
            List<Integer> list = new ArrayList<>();

            while (sc.hasNextInt()){
                list.add(sc.nextInt());
            }
            System.out.println(restorePerm(list));
        }
    }
}
