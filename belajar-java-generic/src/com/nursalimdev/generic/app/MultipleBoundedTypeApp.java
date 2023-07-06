package com.nursalimdev.generic.app;

public class MultipleBoundedTypeApp {
    public static void main(String[] args) {
//        Data<Manager> manager = new Data<>(new Manager()); // ERROR
        Data<VicePresident> vp = new Data<>(new VicePresident());
        System.out.println(vp);
    }

    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
//            this.data.sayHello();
        }
    }

    public interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Employee implements CanSayHello {
        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }
}
