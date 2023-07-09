package com.nursalimdev.collection.app;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> names = new Vector<>();
        names.add("Nursalim");
        names.add("Toni");
        names.add("Ziah");

        for (String name: names) {
            System.out.println(name);
        }
    }
}
