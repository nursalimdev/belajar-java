package com.nursalimdev.generic.app;

import com.nursalimdev.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("Nursalim", "Al Farizi");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Pair<String, Integer> pair2 = new Pair<>("Mangga", 100);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
