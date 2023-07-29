package nursalim.dev.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Random;

public class RandomCalculatorTest extends AbstractCalculatorTest {
    @Test
    public void testRandom(Random random) {
        var val1 = random.nextInt();
        var val2 = random.nextInt();
        var expected = val1 + val2;
        Assertions.assertEquals(expected, calculator.add(val1, val2));
    }

    @DisplayName("Test random calculator")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    public void testRandomRepeat(Random random) {
        var val1 = random.nextInt();
        var val2 = random.nextInt();
        var expected = val1 + val2;
        Assertions.assertEquals(expected, calculator.add(val1, val2));
    }

    @DisplayName("Test random calculator")
    @RepeatedTest(
            value = 10,
            name = "${displayName}"
    )
    public void testRandomRepeatInfo(TestInfo info, Random random, RepetitionInfo repetitionInfo) {
        System.out.println(info.getDisplayName() + "ke " + repetitionInfo.getCurrentRepetition() + "dari " + repetitionInfo.getTotalRepetitions());
        var val1 = random.nextInt();
        var val2 = random.nextInt();
        var expected = val1 + val2;
        Assertions.assertEquals(expected, calculator.add(val1, val2));
    }

    @DisplayName("Test with parameter")
    @ParameterizedTest(name = "{displayName} with data {0}")
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testWithParameter(int value) {
        var result = value + value;
        Assertions.assertEquals(result, calculator.add(value, value));
    }

    public static List<Integer> parameterSource() {
        return List.of(10, 20, 30, 40, 50);
    }

    @DisplayName("Test with parameter")
    @ParameterizedTest(name = "{displayName} with data {0}")
    @MethodSource(value = {"parameterSource"})
    public void testWithMethodSource(Integer value) {
        var result = value + value;
        Assertions.assertEquals(result, calculator.add(value, value));
    }
}
