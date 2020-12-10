package student_alexander_shl.homework.lesson_6.level_4;
/*
- создать класс TwoDimensionalArray,
- создать метод для заполнения массива случайными числами,
- создать метод для подсчёта суммы всех чисел в массиве.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TwoDimensionalArrayTest { // Task_18

    private TwoDimensionalArray twoDimensionalArray;

    @Before
    public void init() {
        twoDimensionalArray = new TwoDimensionalArray();
    }

    @Test
    public void checkTwoDimensionalArray() {
        int[][] twoDimArray = twoDimensionalArray.createArray(3, 3);
        int[][] blankArray = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Assert.assertTrue(Arrays.deepEquals(twoDimArray, blankArray)); // - проверка создания 2-х мерного массива 3х3,

        twoDimensionalArray.arrayFillWithRandomNumbers(twoDimArray);
        Assert.assertFalse(Arrays.deepEquals(twoDimArray, blankArray)); // проверка заполнения созданного массива случайными числами,

        int sumValue = 0;
        for (int[] ints : twoDimArray) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                sumValue += ints[j];
            }
        }
        Assert.assertEquals(sumValue,twoDimensionalArray.sumArrayNumbers(twoDimArray)); // проверка подсчёта суммы всех чисел в массиве.
    }

}