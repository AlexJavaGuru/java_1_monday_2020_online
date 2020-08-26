package student_artur_martinenko.homework.lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void check(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
        }
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        check(arrayUtil.createArray(5).length == 5, "shouldCreateArray");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] temp = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(temp);

        boolean notEmpty = false;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                notEmpty = true;
                break;
            }
        }
        check(notEmpty, "shouldFillArrayWithRandomNumbers");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] temp = {5, -15, 50, -100, 1, 75, -21, 100, 9, -1};
        check(arrayUtil.findMaxNumber(temp) == 100, "shouldFindMaxNumber");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] temp = {5, -15, 50, -100, 1, 75, -21, 100, 9, -1};
        check(arrayUtil.findMinNumber(temp) == -100, "shouldFindMinNumber");
    }


}
