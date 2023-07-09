package com.nursalimdev.collection.app;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> hashTableMap = new Hashtable<>();
        hashTableMap.put("firstName", "Nursalim");
        hashTableMap.put("address", "Jakarta");
        hashTableMap.put("hobby", "Running");

        Set<Map.Entry<String, String>> entries = hashTableMap.entrySet();
        for (var entry: entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
