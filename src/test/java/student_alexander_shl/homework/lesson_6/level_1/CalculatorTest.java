package student_alexander_shl.homework.lesson_6.level_1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testIsEven() {
        Assert.assertFalse(calculator.isEven(5));
        Assert.assertTrue(calculator.isEven(4));
    }

    @Test
    public void testIsEvenNew() {
        Assert.assertFalse(calculator.isEvenNew(5));
        Assert.assertTrue(calculator.isEvenNew(4));
    }

}