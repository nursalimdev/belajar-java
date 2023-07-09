package com.nursalimdev.collection.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Nursalim", "Ziah", "Toni", "Yana"));
        Collections.sort(names);
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);

    }
}
