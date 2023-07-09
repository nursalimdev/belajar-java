package com.nursalimdev.collection.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000);
        for (var i = 1; i <= 1000; i++) {
            list.add(i);
        }

        int i = Collections.binarySearch(list, 500);
        System.out.println(i);

        Comparator<Integer> descending = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        System.out.println(Collections.binarySearch(list, 300, descending));
    }
}
