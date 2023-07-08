package com.nursalimdev.collection.app;

import java.util.Collections;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> emptySet = Collections.emptySet();
        Set<String> singletonSet = Collections.singleton("Nursalim");
        Set<String> collectionSet = Set.of("Nursalim", "Al Farizi");
        Set<String> unmodifiebleSet = Collections.unmodifiableSet(collectionSet);
    }
}
