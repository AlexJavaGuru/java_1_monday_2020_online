package student_lilija_g.homework.lesson_5.level_6.task_37_38_39;
/*
Task_37:
В классе ArrayUtilTest напишите автоматический тест
для метода int findMaxNumber(int[] array)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }

    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
    }

    public void shouldFindMaxNumber() {
        // Write test implementation here !!!
    }
}

Task_39:
В классе ArrayUtilTest напишите автоматический тест
для метода int findMinNumber(int[] array)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }

    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
    }

    public void shouldFindMaxNumber() {
        // Write test implementation here !!!
    }

    public void shouldFindMinNumber() {
        // Write test implementation here !!!
    }
}
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
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
        for (int i : myArray) {
            sumValue += i;
        }

        arrayUtil.printArrayToConsole(myArray); // Для себя, чтобы убедиться точно
        System.out.println("Sum: "+sumValue);   // Для себя, чтобы убедиться точно

        totalTest(sumValue, arrayUtil.sumArray(myArray),"shouldFillArrayWithRandomNumbers Test" );

    }

    public void shouldFindMaxNumber() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {56, 100, 85, 3, 45, 15};

    //    arrayUtil.printArrayToConsole(myArray);
        totalTest(100, arrayUtil.findMaxNumber(myArray),"shouldFindMaxNumber Test" );
    }

    public void shouldFindMinNumber() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {56, 100, 85, 3, 45, 15};

    //   arrayUtil.printArrayToConsole(myArray);
        totalTest(3, arrayUtil.findMinNumber(myArray),"shouldFindMinNumber Test" );
    }

    void totalTest(int expectedValue, int actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
