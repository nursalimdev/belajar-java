package com.nursalimdev.generic.app;

import com.nursalimdev.generic.MyData;
import com.nursalimdev.generic.NumberData;

public class WilcardApp {
    public static void main(String[] args) {
        print(new MyData<>("Nursalim"));
        print(new MyData<>(new NumberData(123)));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
