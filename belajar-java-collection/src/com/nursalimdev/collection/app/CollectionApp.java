package com.nursalimdev.collection.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> namaBuah = new ArrayList<>();

        // menambahkan data
        namaBuah.add("Mangga");
        namaBuah.add("Jeruk");
        namaBuah.add("Apel");

        // menambahkan semua data
        namaBuah.addAll(Arrays.asList("Durian", "Jambu", "Manggis"));

        for (var buah: namaBuah) {
            System.out.println(buah);
        }

        // menghapus data
        namaBuah.remove("Jeruk");
        namaBuah.removeAll(List.of("Durian", "Jambu"));

        for (var buah: namaBuah) {
            System.out.println(buah);
        }

        // mengecek data
        System.out.println(namaBuah.contains("Mangga"));
        System.out.println(namaBuah.containsAll(List.of("Mangga", "Durian")));

        // mendapatkan ukuran data
        System.out.println(namaBuah.size());
    }
}
