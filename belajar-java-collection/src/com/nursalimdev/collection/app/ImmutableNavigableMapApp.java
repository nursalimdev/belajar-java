package com.nursalimdev.collection.app;

import java.util.Collections;
import java.util.NavigableMap;

public class ImmutableNavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> unmodifiable = Collections.unmodifiableNavigableMap(empty);
    }
}
