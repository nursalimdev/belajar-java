package nursalim.dev.app;

import nursalim.dev.data.Animal;
import nursalim.dev.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.name = "Pussy";
        cat.run();
    }
}
