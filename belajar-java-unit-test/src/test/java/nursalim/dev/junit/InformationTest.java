package nursalim.dev.junit;

import org.junit.jupiter.api.*;

@DisplayName("Information test")
public class InformationTest {
    @Test
    @Tags({
            @Tag("Tag 1"),
            @Tag("Tag 2")
    })
    @DisplayName("Test 1")
    public void test1(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
    }
}
