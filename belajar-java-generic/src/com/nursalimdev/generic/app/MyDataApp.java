package com.nursalimdev.generic.app;

import com.nursalimdev.generic.MyData;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<>("Nursalim");
        MyData<Integer> myDataInt = new MyData<>(70);
        MyData<Boolean> myDataBoolean = new MyData<>(true);

        System.out.println(myDataString.getData());
        System.out.println(myDataInt.getData());
        System.out.println(myDataBoolean.getData());
    }
}
