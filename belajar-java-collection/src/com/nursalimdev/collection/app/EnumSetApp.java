package com.nursalimdev.collection.app;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
    public static enum Gender {
        MALE, FEMALE, OTHER
    }
    public static void main(String[] args) {
//        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        Set<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);

        for (var gender: genders) {
            System.out.println(gender.name());
        }
    }
}
