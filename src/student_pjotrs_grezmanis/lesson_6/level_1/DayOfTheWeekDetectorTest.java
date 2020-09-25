package student_pjotrs_grezmanis.lesson_6.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Мы с вами уже так далеко прошли, а метод check делать так и не научились. Будем учиться =) Сделайте рефакторинг и вынесите все в метод check")
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
        if ("Monday".equals(testObject.recognizeDayOfTheWeek(1))) {
            System.out.println("testSuccessMonday() OK");
        } else {
            System.out.println("testSuccessMonday() Failed");
        }
    }

    public void testSuccessTuesday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();

        if ("Tuesday".equals(testObject.recognizeDayOfTheWeek(2))) {
            System.out.println("testSuccessTuesday() OK");
        } else {
            System.out.println("testSuccessTuesday() Failed");
        }
    }
    public void testSuccessWednesday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        if ("Wednesday".equals(testObject.recognizeDayOfTheWeek(3))) {
            System.out.println("testSuccessWednesday() OK");
        } else {
            System.out.println("testSuccessWednesday() Failed");
        }
    }
    public void testSuccessThursday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        if ("Thursday".equals(testObject.recognizeDayOfTheWeek(4))) {
            System.out.println("testSuccessThursday() OK");
        } else {
            System.out.println("testSuccessThursday() Failed");
        }
    }
    public void testSuccessFriday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        if ("Friday".equals(testObject.recognizeDayOfTheWeek(5))) {
            System.out.println("testSuccessFriday() OK");
        } else {
            System.out.println("testSuccessFriday() Failed");
        }
    }
    public void testSuccessSaturday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        if ("Saturday".equals(testObject.recognizeDayOfTheWeek(6))) {
            System.out.println("testSuccessSaturday() OK");
        } else {
            System.out.println("testSuccessSaturday() Failed");
        }
    }
    public void testSuccessSunday() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        if ("Sunday".equals(testObject.recognizeDayOfTheWeek(7))) {
            System.out.println("testSuccessSunday() OK");
        } else {
            System.out.println("testSuccessSunday() Failed");
        }
    }



    public void testIncorrectDayOfWeek() {
        DayOfTheWeekDetector testObject = new DayOfTheWeekDetector();
        String expectedResult = "Please input a valid number between 1 and 7";

        if (expectedResult.equals(testObject.recognizeDayOfTheWeek(0))) {
            System.out.println("testIncorrectDayOfWeek with 0 OK");
        } else {
            System.out.println("testIncorrectDayOfWeek with 0 Failed");
        }

        if (expectedResult.equals(testObject.recognizeDayOfTheWeek(8))) {
            System.out.println("testIncorrectDayOfWeek with 8 OK");
        } else {
            System.out.println("testIncorrectDayOfWeek with 8 Failed");
        }
    }
}

