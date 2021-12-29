package com.project.codeforces;


import java.util.*;

public class SpyDetected {

    private static int uniqueInteger(List<Integer> input){

        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<input.size(); i++){

            if (!map.containsKey(input.get(i))){
                map.put(input.get(i), 1);
            }else {
                map.put(input.get(i), map.get(input.get(i))+1);
            }
        }

        int num = 0;
        for (Map.Entry<Integer,Integer> a : map.entrySet()){

            if (a.getValue() == 1){
                num = a.getKey();
            }
        }

        for (int i=0; i<input.size(); i++){

            if (input.get(i).equals(num)){
                return i+1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (scanner.hasNextInt()){

            scanner.nextLine();

            String s = scanner.nextLine();
            Scanner sc = new Scanner(s);
            List<Integer> list = new ArrayList<>();

            while (sc.hasNextInt()){
                list.add(sc.nextInt());
            }

            System.out.println(uniqueInteger(list));
        }
    }
}
