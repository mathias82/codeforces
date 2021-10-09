package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Candies {

    private static String equalCandies(int candies, int people){

        List<Integer> answer = new ArrayList<>();

        if (candies % people == 0){
            while (true){
                answer.add(candies/people);
                if (answer.stream().mapToInt(i-> i).sum() == candies){
                    break;
                }
            }
        } else {

            int num = candies / people;
            int i=0;

            while (people-- > 0){
                answer.add(num);
            }

            while (true){

                int sum = answer.stream().mapToInt(j-> j).sum();

                if (sum == candies){
                    break;
                } else {

                    answer.set(i, answer.get(i) + 1);

                }
                i++;
            }



        }
        return answer.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int candies = scanner.nextInt();
        int people = scanner.nextInt();

        System.out.println(equalCandies(candies,people));
    }
}
