package com.nursalimdev.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String str = "Belajar Pemrograman Java";

        String encode = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encode);

        byte[] decode = Base64.getDecoder().decode(encode);
        System.out.println(new String(decode));


    }
}
