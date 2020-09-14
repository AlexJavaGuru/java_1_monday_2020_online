package student_aleksejs_ivanovs.homework.lesson_5.level_5_and_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Сделайте refactoring. Сократите повторяющийся код в тестах. Для этого необходимо вынести проверку в отдельный метод.")
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = array.createArray(3);

        int actualResult = newArray.length;

        int expectedResult = 3;

        check(expectedResult, actualResult, "shouldCreateArray");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = array.createArray(3);
        array.fillArrayWithRandomNumbers(newArray);

        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }

        if (sum > 0) {
            System.out.println("FillArrayWithRandom Has passed");
        } else {
            System.out.println("FillArrayWithRandom Failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {52, 59, 56, 67, 48};

        int actualResult = array.findMaxNumber(newArray);

        int expectedResult = 67;

        check(expectedResult, actualResult, "shouldFindMaxNumber");
    }

    public void shouldFindMinNumber() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {24, 18, 33, 36, 41};

        int actualResult = array.findMinNumber(newArray);

        int expectedResult = 18;

        check(expectedResult, actualResult, "shouldFindMinNumber");
    }

    private void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedResult + " but actual result was : " + actualResult);
        }
    }
}
