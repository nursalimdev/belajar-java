package nursalim.dev.junit;

import org.junit.jupiter.api.Test;

public class LifecycleTest {
    private String temp;
    @Test
    public void testA() {
        temp = "Nursalim";
    }

    @Test
    public void testB() {
        System.out.println(temp);
    }

    @Test
    public void testC() {
    }
}
