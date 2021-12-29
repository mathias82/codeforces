package com.project.Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *  0 - 1
 *  1 - 1 1
 *  2 - 1 2 1
 *  3 - 1 3 3 1
 *  4 - 1 4 6 4 1
 */

public class PascalsTriangle {

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<rowIndex+1; i++){
            answer.add(0,1);
            for (int j=1; j<answer.size()-1; j++){
                answer.set(j, answer.get(j) + answer.get(j + 1));
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(getRow(1));
    }
}
