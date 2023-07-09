package com.nursalimdev.collection.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionsDefaultMethodApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (var i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer data) {
                return data * 10;
            }
        });

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer data) {
                System.out.println(data);
            }
        });

        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer data) {
                return data > 500;
            }
        });
        System.out.println(numbers);
    }
}
