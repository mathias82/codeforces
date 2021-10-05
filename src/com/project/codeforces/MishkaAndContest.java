package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MishkaAndContest {

    private static int firstLast(List<Integer> input,int k){

        int i=0;
        int j=input.size()-1;
        int count=0;

        while (i<=j){

            if (input.get(0)<=k){
                input.remove(0);
                count++;
            }
            else if (input.get(input.size()-1)<=k){
                input.remove(input.size()-1);
                count++;
            }

            i++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<Integer> ints = new ArrayList<>();
        int N = scanner.nextInt();

        while (T-- >0 ){
            ints.add(scanner.nextInt());
        }
        System.out.println(firstLast(ints,N));
    }
}
