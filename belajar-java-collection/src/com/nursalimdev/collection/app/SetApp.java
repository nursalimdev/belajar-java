package com.nursalimdev.collection.app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
//        Set<String> namaMahasiswa = new HashSet<>();
        Set<String> namaMahasiswa = new LinkedHashSet<>();

        // menambahkan data
        namaMahasiswa.add("Nursalim");
        namaMahasiswa.add("Ziah");
        namaMahasiswa.add("Nani");
        namaMahasiswa.add("Ziah");

        for (String nama: namaMahasiswa) {
            System.out.println(nama);
        }
    }
}
