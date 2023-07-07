package com.nursalimdev.generic.app;

import com.nursalimdev.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Person[] persons = {
                new Person("Nursalim", "Jakarta"),
                new Person("Ziah", "Bandung"),
                new Person("Toni", "Cirebon"),
        };

        Arrays.sort(persons, comparator);
        System.out.println(Arrays.toString(persons));
    }
}
