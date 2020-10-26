package teacher.lesson_13.lessoncode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    private Calculator victim;

    @Before
    public void init() {
        victim = new Calculator();
    }

    @Test
    public void testSumOfTwoNumbers() {
        int result = victim.sum(4, 1);
        assertEquals(5, result);
    }

    @Test
    public void testSumOfTwoNumbersV2() {
        int result = victim.sum(0, 1);
        assertEquals(1, result);
    }

    @Test
    public void assertTrueExampleTest() {
        boolean result = true;
        assertTrue(result);
    }
}