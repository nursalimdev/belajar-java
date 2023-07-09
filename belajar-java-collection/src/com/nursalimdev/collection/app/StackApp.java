package com.nursalimdev.collection.app;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Nursalim");
        names.push("Toni");
        names.push("Ziah");

        for (var name = names.pop(); name != null; name = names.pop()) {
            System.out.println(name);
        }
    }
}
