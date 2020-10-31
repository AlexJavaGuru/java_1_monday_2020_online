package student_artur_martinenko.homework.lesson_13.level_5_middle.task_26_32;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void init() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void stringCalculatorTestShouldReturnZero() {
        int number = stringCalculator.add("");
        assertEquals(0, number);
    }

    @Test
    public void stringCalculatorTestAcceptsOneNumber() {
        int number = stringCalculator.add("5");
        assertEquals(5, number);
    }

    @Test
    public void stringCalculatorTestAcceptsTwoNumbers() {
        int number = stringCalculator.add("1,1");
        assertEquals(2, number);
    }

    @Test
    public void stringCalculatorTestAcceptsMultipleNumbers() {
        int number = stringCalculator.add("1,1,1,5,5");
        assertEquals(13, number);
    }

    @Test
    public void stringCalculatorTestAcceptsNumbersWithNewLines() {
        int number = stringCalculator.add("1\n23,4");
        assertEquals(10, number);
    }

    @Test
    public void stringCalculatorTestAcceptsDifferentDelimiter() {
        int number = stringCalculator.add("//[;]\n1;2");
        assertEquals(3, number);
    }

    @Test
    public void stringCalculatorTestAcceptsDifferentDelimiters() {
        int number = stringCalculator.add("//[;][&]\n1;2&3");
        assertEquals(6, number);
    }


}

//Task_27
/*
Если вы еще не создали класс StringCalculatorTest то создайте его
и напишите автоматические тесты для проверки метода add().
 */

//Task_28
/*
Если вы еще не создали класс StringCalculatorTest то создайте его
и напишите автоматические тесты для проверки метода add().

Начните с реализации самого простого теста для случая с пустой строкой
и далее созжайте тесты для одного и двух чисел.
 */
