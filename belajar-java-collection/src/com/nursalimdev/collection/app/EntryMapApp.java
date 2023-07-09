package com.nursalimdev.collection.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("firstName", "Nursalim");
        map.put("address", "Jakarta");
        map.put("hobby", "Running");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (var entry: entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
