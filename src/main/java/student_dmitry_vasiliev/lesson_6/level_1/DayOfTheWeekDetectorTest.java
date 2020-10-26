package student_dmitry_vasiliev.lesson_6.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {

        DayOfTheWeekDetector testOfDay = new DayOfTheWeekDetector();

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.tests();
    }

    void tests() {
        System.out.print("Input integer number between 1 and 7 : ");
        Scanner myInput = new Scanner(System.in);
        int number = myInput.nextInt();
        System.out.println(testOfDay.detectDayName(number));
        generalCheck("Monday", testOfDay.detectDayName(1), "-Monday-");
        generalCheck("Tuesday", testOfDay.detectDayName(2), "-Tuesday-");
        generalCheck("Wednesday", testOfDay.detectDayName(3), "-Wednesday-");
        generalCheck("Thursday", testOfDay.detectDayName(4), "-Thursday-");
        generalCheck("Friday", testOfDay.detectDayName(5), "-Friday-");
        generalCheck("Saturday", testOfDay.detectDayName(6), "-Saturday-");
        generalCheck("Sunday", testOfDay.detectDayName(7), "-Sunday-");

        generalCheck("Please input a valid number between 1 and 7", testOfDay.detectDayName(0), " Check your entering!");
        generalCheck("Please input a valid number between 1 and 7", testOfDay.detectDayName(8), " Check your entering!");
    }

    public void generalCheck(String actualResult, String expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("Actual value is: " + actualResult + ", expected value is: " + expectedResult + ". Test " + testName + " has passed.");}
            else {
                System.out.println("Actual value is: " + actualResult + ", expected value is: " + expectedResult + ". Test " + testName + " failed.");}
        }
    }

