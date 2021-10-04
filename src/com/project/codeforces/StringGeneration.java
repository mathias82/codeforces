package com.project.codeforces;

import java.util.Scanner;

public class StringGeneration {

    private static String permutationSub(int N, int K){

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i=1; i<=K; i++){
            stringBuilder.append("a");
        }

        for (int i=0; i<N; i++){
            stringBuilder.append("bca");
        }

        for (int j=0; j<N; j++){
            result.append(stringBuilder.substring(j,j+1));
        }

        return result.toString();
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();


        while (T-- > 0){

            int N = scanner.nextInt();
            int K =scanner.nextInt();

            System.out.println(permutationSub(N,K));
        }

    }

}
