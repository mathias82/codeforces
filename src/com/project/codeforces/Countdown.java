package com.project.codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Countdown {

    private static BigInteger revertNum(BigInteger input){

        StringBuilder stringBuilder = new StringBuilder(input.toString());
        stringBuilder.reverse();
        return new BigInteger(String.valueOf(stringBuilder));
    }

    private static int clock(int a,BigInteger b){

        int i=0;
        int count=0;

        if (b.equals(BigInteger.ZERO)){
            return 0;
        }

        while (i<a){

            BigInteger temp = b.mod(BigInteger.valueOf(10));

            if (!temp.equals(BigInteger.valueOf(0))){
                count++;
                b = b.subtract(BigInteger.valueOf(1));
            }
            else {
                i++;

                b = revertNum(b);
                count++;
            }

            if (b.equals(BigInteger.ZERO)){
                break;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len=scanner.nextInt();

        while (len-->0){

            int a = scanner.nextInt();
            BigInteger b = scanner.nextBigInteger();

            System.out.println(clock(a,b));
        }
    }
}
