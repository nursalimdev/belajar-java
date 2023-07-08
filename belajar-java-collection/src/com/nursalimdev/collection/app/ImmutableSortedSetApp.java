package com.nursalimdev.collection.app;

import java.util.*;

public class ImmutableSortedSetApp {
    public static void main(String[] args) {
        Set<String> emptySortedSet = Collections.emptySortedSet();
        Set<String> set = new TreeSet<>();
        set.addAll(List.of("Nursalim", "Tono"));
        Collections.unmodifiableSortedSet(new TreeSet<>(set));
    }
}
