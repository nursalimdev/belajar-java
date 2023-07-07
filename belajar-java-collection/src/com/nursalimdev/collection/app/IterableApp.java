package com.nursalimdev.collection.app;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> namaBuah = List.of("Mangga", "Jeruk", "Manggis");
        for (var buah: namaBuah) {
            System.out.println(buah);
        }
    }
}
