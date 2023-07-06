package com.nursalimdev.generic.app;

import com.nursalimdev.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>("Nursalim");
        process(data);

        // ini boleh
        MyData<? extends Object> myData = data;
        System.out.println(myData.getData());

    }

    public static void process(MyData<? extends Object> data) {
        System.out.println(data.getData());
//        data.setData("Nanana"); // ERROR
    }
}
