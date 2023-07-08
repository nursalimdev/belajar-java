package com.nursalimdev.collection.app;

import java.util.Collections;
import java.util.List;

public class ImmutableListApp {
    public static void main(String[] args) {
        List<String> namaBuah = List.of("Mangga", "Jeruk", "Apel");
        List<String> empty = Collections.emptyList();
        List<String> tipe = Collections.singletonList("Transfer");
        List<String> hobi = Collections.unmodifiableList(List.of("Mangan", "lunga2"));

        System.out.println(namaBuah);
        System.out.println(empty);
        System.out.println(tipe);
        System.out.println(hobi);
    }
}
