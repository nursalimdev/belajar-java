package com.nursalimdev.collection.app;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ImmutableSortedMapApp {
    public static void main(String[] args) {
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> map = new TreeMap<>(Map.of("firstName", "Nursalim"));
        SortedMap<String, String> unmodifiable = Collections.unmodifiableSortedMap(map);
    }
}
