package com.project.codeforces;


import java.util.*;

public class UniqueBidAuction {


    private static int checkIt(int[] list,int N){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<N; i++){

            if (!map.containsKey(list[i])){
                map.put(list[i],1);
            } else {
                map.put(list[i], map.get(list[i])+1);
            }
        }
        int num = Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> a : map.entrySet()){

            if (a.getValue() == 1 && num>a.getKey()){
                num = Integer.parseInt(String.valueOf(a.getKey()));
            }
        }
        int j=1;

        for (int i=0; i<N; i++){

            if (list[i] == num){
                return j;
            }
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0){

            int N = scanner.nextInt();
            int[] arr = new int[N];

            for (int i=0; i<N; i++){
                arr[i] = scanner.nextInt();
            }

            System.out.println(checkIt(arr,N));
        }
    }
}
