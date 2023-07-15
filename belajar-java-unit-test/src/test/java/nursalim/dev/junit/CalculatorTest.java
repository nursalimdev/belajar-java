package nursalim.dev.junit;

import nursalim.dev.junit.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.opentest4j.TestAbortedException;

//@DisplayName("Test Calculator")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before unit test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After unit test");
    }

    @Test
//    @DisplayName("Test Function Calculator.add(Integer, Integer)")
    public void testAddSuccess() {
        var result = calculator.add(10, 10);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess() {
        Integer result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivideFailed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           calculator.divide(10, 0);
        });
    }

    @Test
    @Disabled
    public void testComingSoon() {
    }

    @Test
    public void testAborted() {
        String profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)) {
            throw new TestAbortedException("Test dibatalkan");
        }

    }

    @Test
    public void testAssumption() {
        Assumptions.assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }
}
