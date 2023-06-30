package nursalim.dev.data;

public class Bus implements Car{
    public void drive() {
        System.out.println("Drive Bus");
    }
    public int getTire() {
        return 8;
    }
    public boolean isBig() {
        return true;
    }
    public String getBrand() {
        return "Hino";
    }
}
