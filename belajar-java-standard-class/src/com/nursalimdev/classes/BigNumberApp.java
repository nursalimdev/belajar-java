package com.nursalimdev.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger number1 = new BigInteger("12345678910111213");
        BigInteger number2 = new BigInteger("11283743848485");
        System.out.println(number1.add(number2));
        System.out.println(number1.subtract(number2));
        System.out.println(number1.divide(number2));
        System.out.println(number1.multiply(number2));
    }
}
