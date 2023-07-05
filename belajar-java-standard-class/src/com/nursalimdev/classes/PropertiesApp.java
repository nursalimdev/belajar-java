package com.nursalimdev.classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            System.out.println(properties.getProperty("person.name"));
            System.out.println(properties.getProperty("person.address"));

            properties.put("person.phone", "0812234");
            properties.store(new FileOutputStream("application.properties"), "Komentar");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
