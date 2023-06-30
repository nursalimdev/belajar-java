package nursalim.dev.data;

public interface Car extends HasBrand {
    void drive();
    int getTire();

    default boolean isBig() {
        return true;
    }
}
