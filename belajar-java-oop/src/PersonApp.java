public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Nursalim";
        person1.address = "Jakarta";
//        person1.country = "Amerika"; // tidak bisa di ubah

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Budi");

        Person person2 = new Person("Nani", "Bandung");
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
    }
}
