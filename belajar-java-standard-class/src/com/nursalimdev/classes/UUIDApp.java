package com.nursalimdev.classes;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        for (var i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
    }
}
