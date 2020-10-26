package teacher.lesson_13.lessoncode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionDemoTest {

    private ExceptionDemo victim;

    @Before
    public void init() {
        victim = new ExceptionDemo();
    }
    @Test(expected = RuntimeException.class)
    public void exceptionTestExample() {
        victim.throwAnErrorMethod();
    }

}