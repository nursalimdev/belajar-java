package com.nursalimdev.classes;

import java.util.Objects;

public class ObjectsApp {

    public static class Data {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data = (Data) o;

            return Objects.equals(name, data.name);
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }

    public static void main(String[] args) {
        execute2(null);
    }


    public static void execute(Data data) {
        System.out.println(data.toString());
        System.out.println(data.hashCode());
    }

    public static void execute2(Data data) {
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}
