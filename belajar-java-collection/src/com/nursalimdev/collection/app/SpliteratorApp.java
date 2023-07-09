package com.nursalimdev.collection.app;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {
        List<String> names = List.of("Nursalim", "Al", "Fauziah", "Naura", "Krasiva", "Ana", "Fauziah");
        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator2.estimateSize());

        spliterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
