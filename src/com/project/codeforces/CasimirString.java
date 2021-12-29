package com.project.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CasimirString {

    private static List<String> yesOrNo(List<String> input){

        List<String> list = new ArrayList<>();

        for (int i=0; i<input.size(); i++){

            int a = 0;
            int b = 0;
            int c = 0;

            for (int j=0; j<input.get(i).length(); j++){

                if (input.get(i).length() == 1){
                    list.add("NO");
                }

                if (input.get(i).charAt(j) == 'A'){
                    a++;
                }
                else if (input.get(i).charAt(j) == 'B'){
                    b++;
                }
                else {
                    c++;
                }
            }

            if (a+c == b && input.get(i).length() > 1){
                list.add("YES");
            }else {
                list.add("NO");
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<String> list = new ArrayList<>();

        while (scanner.hasNext()){
            list.add(scanner.next());
        }

        if (list.get(0).length() == 1){
            list.add("NO");
        }
        for (String a : yesOrNo(list)){
            System.out.println(a);
        }
        scanner.close();    }
}