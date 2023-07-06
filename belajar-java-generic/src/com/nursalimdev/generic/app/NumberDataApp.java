package com.nursalimdev.generic.app;

import com.nursalimdev.generic.NumberData;

import java.math.BigDecimal;

public class NumberDataApp {
    public static void main(String[] args) {
        NumberData<Integer> numberDataInteger = new NumberData<>(100);
        System.out.println(numberDataInteger.getData());

        NumberData<Double> numberDataDouble = new NumberData<>(100.29);
        System.out.println(numberDataDouble.getData());

        NumberData<BigDecimal> numberDataBigDecimal = new NumberData<>(new BigDecimal("19281293123731"));
        System.out.println(numberDataBigDecimal.getData());

    }
}
