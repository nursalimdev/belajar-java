package nursalim.dev.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

//@Tag("integration-test") if single
@Tags({
        @Tag("integration-test")
})
public class SampleIntegrationTest {
    @Test
    public void testIntegrationTest1() {
        System.out.println("Integration Test1");
    }

    @Test
    public void testIntegrationTest2() {
        System.out.println("Integration Test2");
    }
}
