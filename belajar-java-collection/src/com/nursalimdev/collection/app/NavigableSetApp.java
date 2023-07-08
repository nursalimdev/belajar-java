package com.nursalimdev.collection.app;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.addAll(List.of("Toni", "Nani", "Ziah", "Naura"));

        // descending
        NavigableSet<String> desc = navigableSet.descendingSet();
        NavigableSet<String> ziah = navigableSet.headSet("Ziah", true);

        for (var value : navigableSet) {
            System.out.println(value);
        }




    }
}
