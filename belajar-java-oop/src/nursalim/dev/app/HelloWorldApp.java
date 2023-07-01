package nursalim.dev.app;

import nursalim.dev.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld sapa = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " +name);
            }
        };
        sapa.sayHello();
        sapa.sayHello("Nursalim");
    }
}
