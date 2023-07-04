package nursalim.dev.app;

import nursalim.dev.data.Application;
import static nursalim.dev.data.Constant.*;
import nursalim.dev.data.Country;
import nursalim.dev.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);
        System.out.println(MathUtil.sum(10, 30, 50));

        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSOR);
    }
}
