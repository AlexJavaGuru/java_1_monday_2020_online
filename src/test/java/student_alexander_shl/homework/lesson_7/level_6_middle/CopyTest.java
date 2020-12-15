package student_alexander_shl.homework.lesson_7.level_6_middle;

import org.junit.Assert;
import org.junit.Test;

public class CopyTest {

    public Copy myCopy;

    @Test
    public void checkCopy() {
        myCopy = new Copy();
        int[] array = {23, 45, 34, 99, 5, 16, 96, 24, 12, 14};
        int[] newArrayOne = {34, 99, 5};
        Assert.assertArrayEquals(myCopy.copyInRange(array, 2, 4), newArrayOne);

        int[] newArrayTwo = {5, 16, 96, 24, 12};
        Assert.assertArrayEquals(myCopy.copyInRange(array, 4, 8), newArrayTwo);
    }

}