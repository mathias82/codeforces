package com.project.Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountBinarySubstrings {

    private static int countBinary(List<String> input){

        int answer = 0;
        List<String> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();

        for (int i=0; i<input.size(); i++){

            int one = 0;
            int zero = 0;

            for (int j=0; j<input.get(i).length(); j++){

                if (!set.add(input.get(i).charAt(j))){

                    System.out.println(set);
                } else {
                    System.out.println(set + " e");

                }

            }

            if (one == zero){
                list.add(input.get(i));
            }
        }

        System.out.println(list);

        return answer;
    }

    public static int countBinarySubstrings(String s) {

        List<String> list = new ArrayList<>();

        for (int i=0; i<s.length(); i++){

            for (int j=i; j<s.length(); j++){
                list.add(s.substring(i,j+1));
            }
        }

        System.out.println(list);

        return countBinary(list);
    }

    public static void main(String[] args) {

        System.out.println(countBinarySubstrings("00110011"));
    }
}
