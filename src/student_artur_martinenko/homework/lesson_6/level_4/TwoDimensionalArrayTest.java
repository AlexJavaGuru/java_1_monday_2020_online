package student_artur_martinenko.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.stream.IntStream;

@CodeReview(approved = true)
class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest victim = new TwoDimensionalArrayTest();
        victim.sumArrayValueTest();

    }

    public void check(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
        }
    }

    public void sumArrayValueTest() {
        TwoDimensionalArray temp = new TwoDimensionalArray();
        int[][] arr = {{1, 2}, {3, 4}, {4, 5}};
        int result = temp.sumArrayValue(arr);
        boolean flag = result == 19;
        check(flag, "sumArrayValueTest");
    }

}
