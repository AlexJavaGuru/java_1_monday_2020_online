package student_regina_svistunov.lesson_6.level_1;

import java.util.Scanner;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.mondayTest();
        dayOfTheWeekDetectorTest.tuesdayTest();
        dayOfTheWeekDetectorTest.wednesdayTest();
        dayOfTheWeekDetectorTest.thursdayTest();
        dayOfTheWeekDetectorTest.fridayTest();
        dayOfTheWeekDetectorTest.saturdayTest();
        dayOfTheWeekDetectorTest.sundayTest();


    }

    void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println( testName + " is passed!");
        } else {
            System.out.println( testName + " is failed!");
        }
    }

    boolean expected(String string) {
        return  string != null && !string.equals("");
    }

    void mondayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(1);
        check(expected(day), day.equals("Monday"), "mondayTest");
    }
    void tuesdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(2);
        check(expected(day), day.equals("Tuesday"), "tuesdayTest");
    }
    void wednesdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(3);
        check(expected(day), day.equals("Wednesday"), "wednesdayTest");
    }
    void thursdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(4);
        check(expected(day), day.equals("Thursday"), "thursdayTest");
    }
    void fridayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(5);
        check(expected(day), day.equals("Friday"), "fridayTest");
    }
    void saturdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(6);
        check(expected(day), day.equals("Saturday"), "saturdayTest");
    }
    void sundayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(7);
        check(expected(day), day.equals("Sunday"), "sundayTest");
    }





}

