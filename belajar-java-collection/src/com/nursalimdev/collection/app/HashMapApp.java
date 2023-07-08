package com.nursalimdev.collection.app;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        // create map
        Map<String, String> map = new HashMap<>();

        // add value
        map.put("firstName", "Nursalim");
        map.put("lastName", "Aja");
        map.put("email", "nursalim@gmail.com");

        // get value
        System.out.println(map.get("fistName"));
        System.out.println(map.get("lastName"));
        System.out.println(map.get("email"));
    }
}
