package com.nursalimdev.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        // konversi string ke number
        String numberString = "125000";
        int intNumber = Integer.parseInt(numberString);
        Integer intNumber2 = Integer.valueOf(numberString);

        // konversi string ke number
        String stringNumber = String.valueOf(10000);
    }
}
