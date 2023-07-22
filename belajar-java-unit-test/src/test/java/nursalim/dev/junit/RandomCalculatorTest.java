package nursalim.dev.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class RandomCalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testRandom(Random random) {
        var val1 = random.nextInt();
        var val2 = random.nextInt();
        var expected = val1 + val2;
        Assertions.assertEquals(expected, calculator.add(val1, val2));
    }
}
