package student_dmitry_vasiliev.lesson_6.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Task_1Demo {

    public static void main(String[] args) {
        Task_1Demo test = new Task_1Demo();
        test.evenTest();
        test.oddTest();
    }

    public void evenTest() {
        int number = 2;
        int result = Task_1.isEven(number);
        printTestResult(result, 0, "EvenTest");
    }

    public void oddTest() {
        int number = 1;
        int result = Task_1.isEven(number);
        printTestResult(result, 1, "OddTest");
    }

    public void printTestResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
            System.out.println("Expected:" + expectedResult + " but actual is: " + actualResult);
        }
    }
}
