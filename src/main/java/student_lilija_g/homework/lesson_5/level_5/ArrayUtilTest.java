package student_lilija_g.homework.lesson_5.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

/*
Task_32:
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
метода int[] createArray(int arrayLength)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }

}

Task_34:
В классе ArrayUtilTest напишите автоматический тест
метода void fillArrayWithRandomNumbers(int[] array)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }

    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
    }
}
 */
@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArrayOne = arrayUtil.createArray(5);
        totalTest(5, myArrayOne.length, "ArrayUtilTest myArrayOne");

        int[] myArrayTwo =arrayUtil.createArray(10);
        totalTest(10, myArrayTwo.length, "ArrayUtilTest myArrayTwo");
    }

    public void shouldFillArrayWithRandomNumbers() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(myArray);

        int sumValue = 0;

//      for (int i = 0; i < myArray.length; i++) {
//          sumValue += myArray[i];
//      }
        for (int i : myArray) { // итерация по массиву с использованием расширенного цикла for
            sumValue += i;
        }

        totalTest(sumValue, arrayUtil.sumArray(myArray),"shouldFillArrayWithRandomNumbers Test" );

    }

    void totalTest(int expectedValue, int actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
