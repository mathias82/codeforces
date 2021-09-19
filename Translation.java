package com.project.controller.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Translation {

    public static String translation(List<String> input) {

        StringBuilder wordA = new StringBuilder();

            for (int j=input.get(0).length()-1; j>=0; j--){
                wordA.append(input.get(0).charAt(j));
            }

            if (input.size() > 1) {
                return wordA.toString().equals(input.get(1)) ? "YES" : "NO";
            }
            else {
                return null;
            }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        List<String> integerList = new ArrayList<>();

        while (sc.hasNext()){

            String s = sc.nextLine();
            Scanner scanner = new Scanner(s);

            while (scanner.hasNext()){
                integerList.add(scanner.next());
            }

            scanner.close();
        }
        System.out.println(translation(integerList));

        sc.close();
    }
}
