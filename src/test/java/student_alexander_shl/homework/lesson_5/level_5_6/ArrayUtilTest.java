package student_alexander_shl.homework.lesson_5.level_5_6;

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
    public void createArray() {  // level_5 Task_31
        int[] numbersArray = arrayUtil.createArray(6);
        Assert.assertEquals(6, numbersArray.length);
    }
}

