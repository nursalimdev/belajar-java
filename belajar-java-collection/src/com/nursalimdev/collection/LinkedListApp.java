package com.nursalimdev.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListApp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Nursalim");
        queue.offer("Ziah");
        queue.offer("Toni");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
