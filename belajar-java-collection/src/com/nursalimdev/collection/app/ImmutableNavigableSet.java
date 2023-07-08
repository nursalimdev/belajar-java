package com.nursalimdev.collection.app;

import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ImmutableNavigableSet {
    public static void main(String[] args) {
        NavigableSet<String> emptyNavigableSet = Collections.emptyNavigableSet();
        NavigableSet<String> names = new TreeSet<>(List.of("Nursalim", "Ziah", "Toni"));
        NavigableSet<String> unmodifiableNavigableSet = Collections.unmodifiableNavigableSet(names);
    }
}
