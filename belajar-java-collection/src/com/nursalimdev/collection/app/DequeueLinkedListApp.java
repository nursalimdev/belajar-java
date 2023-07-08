package com.nursalimdev.collection.app;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueLinkedListApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.offerLast("Nursalim");
        stack.offerLast("Ziah");
        stack.offerLast("Toni");

        System.out.println(stack.size());

        for (String next = stack.pollLast(); next != null; next = stack.pollLast()) {
            System.out.println(next);
        }

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Nursalim");
        queue.offerLast("Ziah");
        queue.offerLast("Toni");

        System.out.println(queue.size());

        for (String next = queue.pollFirst(); next != null; next = queue.pollFirst()) {
            System.out.println(next);
        }


    }
}
