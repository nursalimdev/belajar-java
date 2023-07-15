package nursalim.dev.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows() {
        System.out.println("Running on windows");
    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisableRunOnWindows() {
        System.out.println("Disable on windows");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    public void testEnabledOnJava8() {
        System.out.println("Running on Java 8");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    public void testDisabledOnJava8() {
        System.out.println("Disable running on java 8");
    }
}
