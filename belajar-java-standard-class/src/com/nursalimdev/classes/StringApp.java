package com.nursalimdev.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Nursalim Al Farizi";
        String nameLower = name.toLowerCase();
        String nameUpper = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLower);
        System.out.println(nameUpper);

        System.out.println(name.length());
        System.out.println(name.startsWith("Nur"));
        System.out.println(name.endsWith("Farizi"));

        String[] names = name.split(" ");
        for(var value: names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());

        System.out.println(name.charAt(10));

        char[] chars = name.toCharArray();
        System.out.println(chars);

    }
}
