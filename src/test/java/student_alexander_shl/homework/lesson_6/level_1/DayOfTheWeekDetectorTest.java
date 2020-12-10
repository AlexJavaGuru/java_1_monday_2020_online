package student_alexander_shl.homework.lesson_6.level_1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DayOfTheWeekDetectorTest {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    @Before
    public void init() {
        dayOfTheWeekDetector = new DayOfTheWeekDetector();
    }

    @Test
    public void dayOfTheWeekDetectorTest() {
        assertEquals("Monday",dayOfTheWeekDetector.detectDayName(1));
        assertEquals("Tuesday",dayOfTheWeekDetector.detectDayName(2));
        assertEquals("Wednesday",dayOfTheWeekDetector.detectDayName(3));
        assertEquals("Thursday",dayOfTheWeekDetector.detectDayName(4));
        assertEquals("Friday",dayOfTheWeekDetector.detectDayName(5));
        assertEquals("Saturday",dayOfTheWeekDetector.detectDayName(6));
        assertEquals("Sunday",dayOfTheWeekDetector.detectDayName(7));
        assertEquals("Please input a valid number between 1 and 7",dayOfTheWeekDetector.detectDayName(0));
        assertEquals("Please input a valid number between 1 and 7",dayOfTheWeekDetector.detectDayName(8));
    }
}