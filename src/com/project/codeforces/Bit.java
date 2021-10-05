package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<String> list = new ArrayList<>();

        while (scanner.hasNext()){
            list.add(scanner.next());
        }


        int x = 0;

        for (int i=0; i<list.size(); i++) {

            if (list.get(i).equals("X++")) {
                x++;
            } else if (list.get(i).equals("++X")) {
                ++x;
            } else if (list.get(i).equals("X--")) {
                x--;
            } else {
                --x;
            }
        }
        System.out.println(x);
    }
}
