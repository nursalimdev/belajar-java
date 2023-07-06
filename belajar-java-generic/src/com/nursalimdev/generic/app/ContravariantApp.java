package com.nursalimdev.generic.app;

import com.nursalimdev.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> myDataObject = new MyData<>("Nursalim");
        MyData<? super String> myDataString = myDataObject;
        System.out.println(myDataString.getData());

        process(myDataObject);

    }

    public static void process(MyData<? super String> myData) {
        myData.setData("Ziah");
        System.out.println(myData.getData());
    }
}
