package student_dmitry_vasiliev.lesson_6.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

        public static void main(String[] args) {
            ArrayUtilTest test = new ArrayUtilTest();
            test.shouldCreateArray();
            test.shouldFillArrayWithRandomNumbers();
            test.shouldFindMaxNumber();
            test.shouldFindMinNumber();
            test.shouldFindSelectedNumber();
            test.shouldCountSelectedNumber();
            test.shouldChangeFirstSelectedNumber();
            test.shouldChangeAllSelectedNumber();
            test.shouldArrayRotate();
        }

        public void shouldCreateArray() {
            String testName = "shouldCreateArray";
            ArrayUtil arrayUtil = new ArrayUtil();
            int[] newArray = arrayUtil.createArray(8);
            printTestResult (newArray.length == 8, testName);
        }

        public  void shouldFillArrayWithRandomNumbers() {
            ArrayUtil arrayUtil = new ArrayUtil();
            String testName = "shouldFillArrayWithRandomNumbers";
            int[] newArray1 = arrayUtil.createArray(8);
            int[] newArray2 = arrayUtil.createArray(8);

            arrayUtil.fillArrayWithRandomNumbers(newArray1);
            arrayUtil.printArrayToConsoleString(newArray1);
            arrayUtil.findMaxNumberPrint(newArray1);
            arrayUtil.findMinNumberPrint(newArray1);
            int sumFirst = 0;
            for (int i = 0; i < newArray1.length; i++) {
                sumFirst += newArray1[i];
            }

            arrayUtil.fillArrayWithRandomNumbers(newArray2);
            arrayUtil.printArrayToConsoleString(newArray2);
            arrayUtil.findMaxNumberPrint(newArray2);
            arrayUtil.findMinNumberPrint(newArray2);
            int sumSecond = 0;
            for (int i = 0; i < newArray2.length; i++) {
                sumSecond += newArray2[i];
            }

            printTestResult (sumFirst != sumSecond && sumFirst != 0, testName);
        }

        public void shouldFindMaxNumber() {
            ArrayUtil arrayUtil = new ArrayUtil();
            String testName = "shouldFindMaxNumber";
            int[] array = {1,2,3,4,9,6,7,8};
            int result = arrayUtil.findMaxNumberReturn(array);
            printTestResult(result == 9, testName);
        }

        public void shouldFindMinNumber() {
            ArrayUtil arrayUtil = new ArrayUtil();
            String testName = "shouldFindMinNumber";
            int[] array = {9,2,3,4,5,6,7,8};
            int result = arrayUtil.findMinNumberReturn(array);
            printTestResult(result == 2, testName);
        }

        public void shouldFindSelectedNumber() {
            ArrayUtil arrayUtil = new ArrayUtil();
            String testName = "shouldFindSelectedNumber";
            int[] array = {9,2,3,4,5,6,7,8};
            int selectedNumber = 8;
            int result = arrayUtil.findSelectedNumberReturn(array, selectedNumber);
            printTestResult(result == 8, testName);
        }

        public void shouldCountSelectedNumber() {
            ArrayUtil arrayUtil = new ArrayUtil();
            String testName = "shouldCountSelectedNumber";
            int[] array = {9,2,3,4,5,6,7,9};
            int countNumber = 2;
            int result = arrayUtil.findSelectedNumberReturn(array, countNumber);
            printTestResult(result == 2, testName);
        }

        public void shouldChangeFirstSelectedNumber() {
            ArrayUtil arrayUtil = new ArrayUtil();
            String testName = "shouldChangeFirstSelectedNumber";
            int[] array = {9,2,3,4,5,11,11,9};
            int selectedNumber = 11;
            int newNumber = 10;
            int result = arrayUtil.changeFirstSelectedNumber(array, selectedNumber, newNumber);
            printTestResult(result == 5, testName);
        }

        public void shouldChangeAllSelectedNumber() {
            ArrayUtil arrayUtil = new ArrayUtil();
            String testName = "shouldChangeAllSelectedNumber";
            int[] array = {9,11,3,4,5,11,11,9};
            int selectedNumber = 11;
            int newNumber = 10;
            int result = arrayUtil.changeAllSelectedNumber(array, selectedNumber, newNumber);
            printTestResult(result == 3, testName);
        }

        public void shouldArrayRotate() {
            ArrayUtil arrayUtil = new ArrayUtil();
            String testName = "shouldArrayRotate";
            int[] array = {1,2,3,4,5,6,7,8};
            int result = arrayUtil.arrayRotate(array);
            printTestResult(result == 8, testName);
        }

        public void printTestResult (boolean check, String testName) {
            if (check) {
               System.out.println("Test " + testName + " has passed!");
                } else {
                    System.out.println("Test " + testName + " failed!");
                }
        }
}

