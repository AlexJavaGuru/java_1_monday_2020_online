package student_alexander_shl.homework.lesson_7.level_6_middle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerCalculatorTest {

    private PowerCalculator powerCalculator;

    @Before
    public void init() {
        powerCalculator = new PowerCalculator();
    }

    @Test
    public void checkPow() {
        Assert.assertEquals(256,powerCalculator.power(2,8),0);
        Assert.assertEquals(0.0000001,powerCalculator.power(10,-7),0);
    }
}