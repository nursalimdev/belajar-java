package com.nursalimdev.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {10, 13, 75, 100, 29, 8, 19};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int idx = Arrays.binarySearch(numbers, 29);
        System.out.println(idx);


    }
}
