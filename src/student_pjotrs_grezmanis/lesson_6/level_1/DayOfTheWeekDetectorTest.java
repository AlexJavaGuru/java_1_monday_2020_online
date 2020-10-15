package student_pjotrs_grezmanis.lesson_6.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {

        DayOfTheWeekDetectorTest weekDayTest = new DayOfTheWeekDetectorTest();
        weekDayTest.testSuccessMonday();
        weekDayTest.testSuccessTuesday();
        weekDayTest.testSuccessWednesday();
        weekDayTest.testSuccessThursday();
        weekDayTest.testSuccessFriday();
        weekDayTest.testSuccessSaturday();
        weekDayTest.testSuccessSunday();
        weekDayTest.testIncorrectDayOfWeek();
    }

    public void testSuccessMonday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        check("Monday",
                testObject.recognizeDayOfTheWeek(1),
                "testSuccessMonday()"
        );
    }

    public void testSuccessTuesday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        check("Tuesday",
                testObject.recognizeDayOfTheWeek(2),
                "testSuccessTuesday()"
        );
    }

    public void testSuccessWednesday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        check("Wednesday",
                testObject.recognizeDayOfTheWeek(3),
                "testSuccessWednesday()"
        );
    }

    public void testSuccessThursday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        check("Thursday",
                testObject.recognizeDayOfTheWeek(4),
                "testSuccessThursday()"
        );
    }

    public void testSuccessFriday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        check("Friday",
                testObject.recognizeDayOfTheWeek(5),
                "testSuccessFriday()"
        );
    }

    public void testSuccessSaturday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        check("Saturday",
                testObject.recognizeDayOfTheWeek(6),
                "testSuccessSaturday()"
        );
    }

    public void testSuccessSunday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        check(
                "Sunday",
                testObject.recognizeDayOfTheWeek(7),
                "testSuccessSunday()"
        );

    }


    public void testIncorrectDayOfWeek() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        String expectedResult = "Please input a valid number between 1 and 7";
        check(
                expectedResult,
                testObject.recognizeDayOfTheWeek(0),
                "testIncorrectDayOfWeek with 0"
        );
        check(
                expectedResult,
                testObject.recognizeDayOfTheWeek(8),
                "testIncorrectDayOfWeek with 8"
        );

    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " but actual result " + actualResult);
        }
    }

}

