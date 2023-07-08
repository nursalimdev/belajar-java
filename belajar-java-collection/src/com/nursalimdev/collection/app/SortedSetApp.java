package com.nursalimdev.collection.app;

import com.nursalimdev.collection.data.Person;
import com.nursalimdev.collection.data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
//        SortedSet<Person> persons = new TreeSet<>(new PersonComparator());

        // for descending
        SortedSet<Person> persons = new TreeSet<>(new PersonComparator().reversed());

        persons.add(new Person("Nursalim"));
        persons.add(new Person("Ziah"));
        persons.add(new Person("Toni"));

        for (var person: persons) {
            System.out.println(person.getName());
        }
    }
}
