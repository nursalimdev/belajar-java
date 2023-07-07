package com.nursalimdev.generic;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Nursalim", "Jakarta"),
                new Person("Ziah", "Bandung"),
                new Person("Toni", "Cirebon"),
        };

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
