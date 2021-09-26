package com.project.controller.codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculatingFunction {

    public static void main (String[] array){

        Scanner scanner = new Scanner(System.in);
        BigInteger input = scanner.nextBigInteger();

        if (!input.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {

            input = input.add(BigInteger.valueOf(1)).negate();
        }
        input = input.divide(BigInteger.valueOf(2));


        System.out.println(input);
    }

}