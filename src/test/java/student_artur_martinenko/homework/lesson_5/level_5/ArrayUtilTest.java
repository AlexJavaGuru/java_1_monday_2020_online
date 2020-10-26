package student_artur_martinenko.homework.lesson_5.level_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    private ArrayUtil victim;

    @Before
    public void init() {
        victim = new ArrayUtil();
    }

    @Test
    public void createArray() {
        int[] resultArray = victim.createArray(5);
        assertEquals(5, resultArray.length);
    }

    @Test
    public void findMaxNumber() {
        int[] inputArray = {5, 2 , 45, 23, 11};
        int resultMaxNumber = victim.findMaxNumber(inputArray);
        assertEquals(45, resultMaxNumber);
    }

    @Test
    public void findMinNumber() {
        int[] inputArray = {5, 2 , 45, 23, 11};
        int resultMaxNumber = victim.findMinNumber(inputArray);
        assertEquals(2, resultMaxNumber);
    }

    @Test
    public void findEvenNumber() {
    }

    @Test
    public void findOddNumber() {
    }
}