package nursalim.dev.app;

import nursalim.dev.data.Gender;
import nursalim.dev.data.Level;

import java.util.Arrays;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setLevel(Level.STANDARD);
        System.out.println(customer.getLevel());

        customer.setGender(Gender.FEMALE);
        System.out.println(customer.getGender());
        System.out.println(customer.getGender().getDescription());

        // konversi enum ke string
        String standard = Level.STANDARD.name();
        System.out.println(standard);

        // konversi string ke enum
        Level standard1 = Level.valueOf("STANDARD");
        System.out.println(standard1);

        Level[] values = Level.values();
        Arrays.stream(values).forEach(System.out::println);


    }
}

class Customer {
    Level level;
    Gender gender;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
