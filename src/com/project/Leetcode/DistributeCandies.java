package com.project.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {

        Map<Integer,Integer> map = new HashMap<>();
        int candies = candyType.length/2;
        System.out.println(candies);
        int count = candies;

        for (int i=0; i<candyType.length; i++){

            if(!map.containsKey(candyType[i])){
                map.put(candyType[i],1);
            } else {
                map.put(candyType[i],map.get(candyType[i])+1);
            }
        }

        System.out.println(map);

        return Math.min(candies, map.size());
    }

    public static void main(String[] args) {

        System.out.println(distributeCandies(new int[]{6,6,6,6}));
    }
}
