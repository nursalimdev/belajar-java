package com.nursalimdev.collection.app;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("firstName", "Nursalim");
        map.put("lastName", "Aja");
        map.put("email", "nursalim.me@gmail.com");

        for (var key: map.keySet()) {
            System.out.println(key);
        }
    }
}
