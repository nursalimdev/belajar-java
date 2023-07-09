package com.nursalimdev.collection.app;

import java.util.Arrays;
import java.util.List;

public class ListToArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Nursalim", "Al", "Farizi", "Ana", "Fauziah");
        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));


    }
}
