package com.nursalimdev.collection.app;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> namaBuah = new ArrayList<>();

        // menambahkan data
        namaBuah.add("Jeruk");
        namaBuah.add("Mangga");

        // mendapatkan data
        namaBuah.get(0); // Jeruk

        // menampilkan data
        for (var buah: namaBuah) {
            System.out.println(buah);
        }

        // mengubah data
        namaBuah.set(0, "Apel");

        // menghapus data
        namaBuah.remove("Manggis"); // false




    }
}
