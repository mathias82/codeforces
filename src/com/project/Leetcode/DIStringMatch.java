package com.project.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class DIStringMatch {

    public static int longestPalindrome(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++){

            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }

        int count=0;
        boolean oddFound=false;
        for (Map.Entry<Character,Integer> m : map.entrySet()){

            if (m.getValue() % 2 == 0){
                count += m.getValue();
            } else {
                oddFound=true;
                count += m.getValue() - 1;
            }
        }

        if (oddFound){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("bb"));
    }
}
