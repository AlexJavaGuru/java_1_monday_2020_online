package student_artur_martinenko.homework.lesson_10.level_2_intern.task_4;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo victim = new DayOfTheWeekDetectorDemo();
        victim.DayOfTheWeekDetectorArrayVersionTest();
        victim.DayOfTheWeekDetectorSwitchVersionTest();
        victim.DayOfTheWeekDetectorIfVersionTest();
    }

    public void check(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void DayOfTheWeekDetectorArrayVersionTest() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetectorArrayVersion();
        String day = victim.detectDayName(1);
        check("Monday", day, "DayOfTheWeekDetectorArrayVersionTest");
    }

    public void DayOfTheWeekDetectorSwitchVersionTest() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetectorSwitchVersion();
        String day = victim.detectDayName(1);
        check("Monday", day, "DayOfTheWeekDetectorSwitchVersionTest");
    }

    public void DayOfTheWeekDetectorIfVersionTest() {
        DayOfTheWeekDetector victim = new DayOfTheWeekDetectorIfVersion();
        String day = victim.detectDayName(1);
        check("Monday", day, "DayOfTheWeekDetectorIfVersionTest");
    }

}
