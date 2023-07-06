package com.nursalimdev.generic.app;

import com.nursalimdev.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<>("Nursalim");
//        MyData<Object> myDataObject = myDataString; // error
//        doIt(myDataString); // error

        MyData<Object> data = new MyData<>(100);
//        MyData<Integer> dataInteger = data; // error
    }

    public static void doIt(MyData<Object> myData) {
        // kode program
    }
}
