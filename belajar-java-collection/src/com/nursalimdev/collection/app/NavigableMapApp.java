package com.nursalimdev.collection.app;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("nursalim", "Nursalim");
        map.put("ziah", "Ziah");
        map.put("toni", "Toni");

        for (var key: map.keySet()) {
            System.out.println(map.get(key));
        }

        // ambil key yang kurang dari toni
        System.out.println(map.lowerKey("toni"));

        // ambile key yang lebih dari toni
        System.out.println(map.higherKey("toni"));

        System.out.println(map.floorKey("toni"));

        System.out.println(map.ceilingKey("toni"));

        // descending key
        NavigableMap<String, String> descendingMap = map.descendingMap();
        for (var key : descendingMap.keySet()) {
            System.out.println(key);
        }
    }
}
