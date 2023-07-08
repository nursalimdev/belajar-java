package com.nursalimdev.collection.app;

import com.nursalimdev.collection.data.Person;

import java.util.List;

public class MutableListApp {
    public static void main(String[] args) {
        Person person = new Person("Nursalim");
        person.addHobby("Mancing");
        person.addHobby("Mangan");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby: person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Embuh");
    }
}
