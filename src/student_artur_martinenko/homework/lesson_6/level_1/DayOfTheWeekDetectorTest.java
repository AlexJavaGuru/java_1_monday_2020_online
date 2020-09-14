package student_artur_martinenko.homework.lesson_6.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.detectMondayTest();
        dayOfTheWeekDetectorTest.detectTuesdayTest();
        dayOfTheWeekDetectorTest.detectWednesdayTest();
        dayOfTheWeekDetectorTest.detectThursdayTest();
        dayOfTheWeekDetectorTest.detectFridayTest();
        dayOfTheWeekDetectorTest.detectSaturdayTest();
        dayOfTheWeekDetectorTest.detectSundayTest();
        dayOfTheWeekDetectorTest.detectNullTest1();
        dayOfTheWeekDetectorTest.detectNullTest2();
    }


    public void check(boolean notNull, boolean condition,  String testName) {
        if (condition && notNull) {
            System.out.println("Test " + testName + " - OK");
        } else {
            System.out.println("Test " + testName + " - FAILED");
        }
    }

    public boolean notNull(String string){
        return string != null && !string.equals("");
    }

    public void detectMondayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(1);
        check(notNull(day), day.equals("Monday"), "detectMondayTest");
    }

    public void detectTuesdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(2);
        check(notNull(day), day.equals("Tuesday"), "detectTuesdayTest");
    }

    public void detectWednesdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(3);
        check(notNull(day), day.equals("Wednesday"), "detectWednesdayTest");
    }

    public void detectThursdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(4);
        check(notNull(day), day.equals("Thursday"), "detectThursdayTest");
    }

    public void detectFridayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(5);
        check(notNull(day), day.equals("Friday"), "detectFridayTest");
    }

    public void detectSaturdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(6);
        check(notNull(day), day.equals("Saturday"), "detectSaturdayTest");
    }

    public void detectSundayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(7);
        check(notNull(day), day.equals("Sunday"), "detectSundayTest");
    }

    public void detectNullTest1() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(8);
        check(!notNull(day), day == null, "detectNullTest1");
    }

    public void detectNullTest2() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = dayOfTheWeekDetector.detectDayName(0);
        check(!notNull(day), day == null, "detectNullTest2");
    }







}