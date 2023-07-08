package com.nursalimdev.collection.app;

import com.nursalimdev.collection.data.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("name", "Nursalim");
        sortedMap.put("address", "Jakarta");
        sortedMap.put("hobby", "Running");

        for(var key: sortedMap.keySet()) {
            System.out.println(key + " : " + sortedMap.get(key));
        }

        SortedMap<Person, String> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        map.put(new Person("Nursalim"), "Nursalim");
        map.put(new Person("Ziah"), "Ziah");
        map.put(new Person("Ahmad"), "Ahmad");

        for (var key: map.keySet()) {
            System.out.println(key);
        }

    }
}
