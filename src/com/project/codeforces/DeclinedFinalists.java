package com.project.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DeclinedFinalists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        while (len-->0){
            list.add(scanner.nextInt());
        }

        int max = Collections.max(list);

        if (max-25 <= 0){
            System.out.println(0);
        }else {
            System.out.println(max-25);
        }

    }
}
