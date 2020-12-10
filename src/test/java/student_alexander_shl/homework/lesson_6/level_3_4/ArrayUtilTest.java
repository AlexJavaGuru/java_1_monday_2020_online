package student_alexander_shl.homework.lesson_6.level_3_4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayUtilTest {

    private ArrayUtil arrayUtil;

    @Before
    public void init() {
        arrayUtil = new ArrayUtil();
    }


    @Test
    public void findNumberInArray() {  // level_3 Task_9
        int[] numbersArray = {38, 23, 99, 34, 47, 60};
        Assert.assertTrue(arrayUtil.findNumber(numbersArray, 47));
        Assert.assertFalse(arrayUtil.findNumber(numbersArray,88));
    }

    @Test
    public void findHomMachNumberInArray() { // level_3 Task_10
        int[] numbersArray = {38, 23, 99, 34, 47, 60, 23};
        Assert.assertEquals(2,arrayUtil.howMachContainsNumberInArray(numbersArray,23));
        Assert.assertEquals(1,arrayUtil.howMachContainsNumberInArray(numbersArray,60));
        Assert.assertEquals(0,arrayUtil.howMachContainsNumberInArray(numbersArray,55));
    }

    @Test
    public void replaceNumberInArray() { // level_3 Task_11
        int[] numbersArray = {38, 23, 99, 34, 47, 60, 23};
        Assert.assertFalse(arrayUtil.findNumber(numbersArray, 54));
        Assert.assertTrue(arrayUtil.findNumber(numbersArray, 34));
        arrayUtil.replace(numbersArray,34,54);
        Assert.assertTrue(arrayUtil.findNumber(numbersArray, 54));
    }

    @Test
    public void replaceAllNumberInArray() { // level_3 Task_12
        int[] numbersArray = {38, 23, 99, 34, 23, 60, 23};
        Assert.assertEquals(3,arrayUtil.howMachContainsNumberInArray(numbersArray,23));
        arrayUtil.replaceAll(numbersArray,23,77);
        Assert.assertEquals(3,arrayUtil.howMachContainsNumberInArray(numbersArray,77));
    }

    @Test
    public void checkReversArray(){ // level_3 Task_13
    int[] numbersArray = {38, 23, 99, 34};
    Assert.assertArrayEquals(arrayUtil.arrayRevers(numbersArray),new int[] {34,99,23,38});
    }

    @Test
    public void checkArraySort(){ // level_4 Task_14
        int[] numbersArray = {38, 23, 99, 34};
        Assert.assertArrayEquals(arrayUtil.arraySort(numbersArray),new int[] {23,34,38,99});
    }
}

