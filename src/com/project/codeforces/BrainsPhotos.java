package com.project.codeforces;

import java.util.Objects;
import java.util.Scanner;

public class BrainsPhotos {

    private static String checkColor(String[][] input){

        for (int i=0; i<input.length; i++){

            boolean whatColor = false;

            for (int j=0; j<input[i].length; j++){

                if (Objects.equals(input[i][j], "C") || Objects.equals(input[i][j], "M") || Objects.equals(input[i][j], "Y")){
                    whatColor = true;
                }
            }

            if (whatColor){
                return "#Color";
            }
        }

        return "#Black&White";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int columns = scanner.nextInt();

        String[][] array = new String[row][columns];

        while (row-->0){

                for (int j=0; j<columns; j++){
                    array[row][j] = scanner.next();
                }
        }
        System.out.println(checkColor(array));

    }
}
