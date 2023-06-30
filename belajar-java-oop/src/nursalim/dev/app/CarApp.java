package nursalim.dev.app;

import nursalim.dev.data.Avanza;
import nursalim.dev.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car avanza = new Avanza();
        avanza.drive();
        System.out.println(avanza.getTire());
    }
}
