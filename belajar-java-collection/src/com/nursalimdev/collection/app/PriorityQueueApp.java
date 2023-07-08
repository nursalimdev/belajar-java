package com.nursalimdev.collection.app;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Nursalim");
        queue.offer("Ziah");
        queue.offer("Toni");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
