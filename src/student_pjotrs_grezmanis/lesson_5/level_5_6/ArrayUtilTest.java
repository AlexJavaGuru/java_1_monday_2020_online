package student_pjotrs_grezmanis.lesson_5.level_5_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] arrayUntilOne = arrayUtil.createArray(5);
        if (arrayUntilOne.length == 5) {
            System.out.println("Test array length - OK ");
        } else {
            System.out.println("Test array length - FAILED ");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] arrayUntilTwo = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(arrayUntilTwo);

        int sum = 0;
        for (int p = 0; p < arrayUntilTwo.length; p++) {
            sum += arrayUntilTwo[p];
        }
        if (sum > 0) {
            System.out.println("Test random numbers - OK");
        } else {
            System.out.println("Test random number - FAILED");
        }

    }

    public void shouldFindMaxNumber() {
        ArrayUtil array = new ArrayUtil();
        int[] myArray = {500, -150, 20, -500, 8, -999, 788, 69, 999, -1};
        if (array.findMaxNumber(myArray) == 999) {
            System.out.println("Test max number - OK");
        } else {
            System.out.println("Test max number - FAILED");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil array = new ArrayUtil();
        int[] myArray = {8, -447, 90, 777, -3, 852, -999, 96, 999, 1, -22};
         if (array.findMinNumber(myArray) == 999) {
             System.out.println("Test min number - OK");
         } else{
             System.out.println("Test min number - FAILED");
                 }
             }
         }



