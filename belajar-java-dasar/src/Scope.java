public class Scope {
    public static void main(String[] args) {

    }

    static void sayHello(String firstName) {
        String hello = "Hello " + firstName;

        if(!firstName.isBlank()) {
            String hi = "Hi " + firstName;
            System.out.println(hi);
        }

        System.out.println(hello);
//        System.out.println(hi); // error
    }
}
