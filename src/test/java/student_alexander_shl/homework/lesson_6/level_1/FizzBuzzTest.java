package student_alexander_shl.homework.lesson_6.level_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void init() {
        FizzBuzz fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizzBuzz() {
        String result = fizzBuzz.detect(15) ;
        assertEquals("FizzBuzz", result);

        //      assertEquals("FizzBuzz",fizzBuzz.detect(15));

        //       assertEquals("Fizz",fizzBuzz.detect(27));
        //       assertEquals("Buzz",fizzBuzz.detect(50));
        //       assertEquals("FizzFuzz",fizzBuzz.detect(30));
//        assertEquals("38",fizzBuzz.detect(38));
    }
}