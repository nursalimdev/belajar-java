public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Nursalim");
        sayHello("Prof", "Nursalim");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String gelar, String nama) {
        System.out.println("Hello " + gelar + " " + nama);
    }
}
