package com.nursalimdev.collection.app;

import com.nursalimdev.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();
        queue.offer("Nursalim");
        queue.offer("Toni");
        queue.offer("Ziah");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
