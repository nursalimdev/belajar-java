package nursalim.dev.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

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

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    public void testEnabledJreRange8To17() {
        System.out.println("Running on range java 8 until java 17");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    public void testDisabledJreRange8To17() {
        System.out.println("Disable running on range java 8 until java 17");
    }

    @Test
    public void testSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    void testEnabledOnJavaVendorOracle() {

    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    void testDisabledOnJavaVendorOracle() {

    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void testEnabledOnDev() {

    }

    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void testDisabledOnDev() {

    }
}
