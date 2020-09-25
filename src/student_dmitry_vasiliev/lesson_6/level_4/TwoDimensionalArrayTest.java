package student_dmitry_vasiliev.lesson_6.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.shouldCreateRandomTwoDimArray();
    }
    public void shouldCreateRandomTwoDimArray() {
        String testName = "shouldCreateRandomTwoDimArray";
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] twoDimArray1 = twoDimensionalArray.createArray(2, 2);
        int[][] twoDimArray2 = twoDimensionalArray.createArray(2, 2);
        twoDimensionalArray.randomArrayCreation(twoDimArray1);
        twoDimensionalArray.randomArrayCreation(twoDimArray2);


        printTestResult(twoDimensionalArray.arrayAllElementSum(twoDimArray1) !=
                twoDimensionalArray.arrayAllElementSum(twoDimArray2) &&
                        twoDimensionalArray.arrayAllElementSum(twoDimArray2) != 0, testName);
    }

    public void printTestResult(boolean check, String testName) {
        if (check) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
        }
    }
}

