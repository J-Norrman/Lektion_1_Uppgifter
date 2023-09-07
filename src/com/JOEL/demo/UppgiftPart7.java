package com.JOEL.demo;
public class UppgiftPart7 {
    public static void main(String[] args) {
        int[] score = new int[]{1, 2, 4, 5, 8};
        for (int value : score) {
            // boolean thing = value %2 == 0;
            // if (thing)
            if (value %2 == 0) {
                System.out.println(value + " Is even");
            } else {
                System.out.println(value + " Is odd");
            }
        }
    }
}