package com.nursalimdev.generic.app;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Nursalim", "Al", "Farizi"};
        System.out.println(ArrayHelper.<String>count(names)); // <String> opsional

        Integer[] nilai = {90, 87, 95, 30};
        System.out.println(ArrayHelper.count(nilai));

    }
}
