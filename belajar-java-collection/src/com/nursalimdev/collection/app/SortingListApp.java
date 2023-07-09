package com.nursalimdev.collection.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Nursalim", "Ziah", "Toni", "Nani"));
        Collections.sort(list);
        System.out.println(list);

        Comparator<String> descendingComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list, descendingComparator);
        System.out.println(list);
    }
}
