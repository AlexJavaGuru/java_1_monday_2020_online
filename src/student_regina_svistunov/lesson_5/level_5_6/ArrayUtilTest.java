package student_regina_svistunov.lesson_5.level_5_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayUtilTest {

        public static void main(String[] args) {
            ArrayUtilTest test = new ArrayUtilTest();
            test.shouldCreateArray();
            test.shouldFillArrayWithRandomNumbers();
            test.shouldFindMaxNumber();
//            test.shouldFindMinNumber();

        }

        public void shouldCreateArray() {
            ArrayUtil arrayUtil = new ArrayUtil();

            int [] myArray = arrayUtil.createArray(7);

            if (myArray.length == 7) {
                System.out.println("Test passed!");
            } else {
                System.out.println("Test failed!");
            }

        }
    public void shouldFillArrayWithRandomNumbers() {
            ArrayUtil arrayUtil = new ArrayUtil();

            int [] myArray = arrayUtil.createArray(7);

            arrayUtil.fillArrayWithRandomNumbers(myArray);

            int sum =0;

            for (int i = 0; i < myArray.length; i++) {
                sum += myArray[i];
            }
            if (sum > 0) {
                System.out.println("Test random Passed!");
            } else {
                System.out.println("Test random Failed!");
            }
    }
    public void shouldFindMaxNumber() {
            ArrayUtil array = new ArrayUtil();
            int[] newArray = {2,6,15,18,28,41,79};
            int arrayMaxNumber = array.findMaxNumber(newArray);

            if (arrayMaxNumber == 79) {
                System.out.println("Max number test passed!");
            } else {
                System.out.println("Max number test failed!");
            }
        }
    }
    // task 39
//     public void shouldFindMinNumber() {
//            ArrayUtil array = new ArrayUtil();
//            int[] newArray = {2, 6, 15, 18, 28, 41, 79};
//            int arrayMinNumber = array.findMinNumber(newArray);
//
//            if (arrayMinNumber == 2) {
//                System.out.println("Min number test passed!");
//            } else {
//                System.out.println("Min number test failed!");
//            }
//    }






