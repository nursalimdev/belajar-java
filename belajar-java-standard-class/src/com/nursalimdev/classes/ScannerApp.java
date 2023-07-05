package com.nursalimdev.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Usia: ");
        int usia = scanner.nextInt();

        System.out.println(nama);
        System.out.println(usia);
    }
}
