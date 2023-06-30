package nursalim.dev.app;

import nursalim.dev.data.City;
import nursalim.dev.data.Location;

public class AbstractClassApp {
    public static void main(String[] args) {
//        Location location = new Location(); //error
        City city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
}
