package com.nursalimdev.collection.app;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> emptyMap = Collections.emptyMap();
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(emptyMap);
        Map<String, String> singletonMap = Collections.singletonMap("firstName", "Nursalim");
        Map<String, String> listOfMap = Map.of("firstName", "Nursalim");

    }
}
