package student_alexander_shl.homework.lesson_5.level_5_6;

/*
================================ level_5 ===================================================
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

================================ level_6 ===================================================
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
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {  // Task_32

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayFirst = arrayUtil.createArray(10);
        checkTest(10, arrayFirst.length, "shouldCreateArray ArrayFirst");

        int[] arraySecond = arrayUtil.createArray(8);
        checkTest(8, arraySecond.length, "shouldCreateArray ArraySecond");

    }

    public void shouldFillArrayWithRandomNumbers() { // Task_34

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);

        int sumResult = 0;
        for (int i : array) {
            sumResult += i;
        }

        checkTest(sumResult, arrayUtil.sumArray(array), "shouldFillArrayWithRandomNumbers");
    }
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {289, 155, 8, 134, 647};
        checkTest(647, arrayUtil.findMaxNumber(array),"shouldFindMaxNumber" );
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {289, 155, 8, 134, 647};
        checkTest(8, arrayUtil.findMaxNumber(array),"shouldFindMinNumber" );       // Write test implementation here !!!
    }

    void checkTest(int calculatedValue, int realValue, String testName) {
        if (calculatedValue == realValue) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("calculatedValue = " + calculatedValue);
            System.out.println("realValue = " + realValue);
        }
    }
}
