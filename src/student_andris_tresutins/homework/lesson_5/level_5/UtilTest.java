package student_andris_tresutins.homework.lesson_5.level_5;
import java.util.Arrays;
public class UtilTest {

    public static void main(String[] args) {
        UtilTest test = new UtilTest();

        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    public void shouldCreateArray() {
        ArrayUtil victim = new ArrayUtil();

        int[] expectedresult1 = new int[3];

        boolean actualresult = Arrays.equals(victim.createArray(3), expectedresult1);
        boolean expectedresult = true;

        check(expectedresult, actualresult, "arraytest");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil victim = new ArrayUtil();

        int[] array = new int[1];
        int[] arrayFillArray = victim.fillArray(1);

        int actualresult = arrayFillArray.length;
        int expectedresult = array.length ;

        check(expectedresult, actualresult, "Array is filled test");
    }

    public void check(int expectedRes, int result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }

    public void check(boolean expectedRes, boolean result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }
}