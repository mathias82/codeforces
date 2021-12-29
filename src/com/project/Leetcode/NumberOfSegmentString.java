package com.project.Leetcode;

public class NumberOfSegmentString {

    private static int countSegments(String s) {

        String[] array = s.split(" ");

        return array.length;

    }

    public static void main(String[] args) {

        System.out.println(countSegments("Hello, my name is John"));
    }
}
