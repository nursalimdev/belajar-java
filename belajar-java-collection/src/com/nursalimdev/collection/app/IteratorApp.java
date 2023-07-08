package com.nursalimdev.collection.app;

import java.util.Iterator;
import java.util.List;

public class IteratorApp {
    public static void main(String[] args) {
        Iterable<String> namaBuah = List.of("Mangga", "Jeruk", "Manggis");
        Iterator<String> iterator = namaBuah.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
