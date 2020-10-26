package student_lilija_g.homework.lesson_10.level_2_intern.task_4;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo myDayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo();
        DayOfTheWeekDetectorIfVersion myDayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();

        myDayOfTheWeekDetectorDemo.totalStringTest("Friday", myDayOfTheWeekDetector.detectDayName(5), "detectDayName Friday");
        myDayOfTheWeekDetectorDemo.totalStringTest("Friday", myDayOfTheWeekDetector.detectDayNameBySwitch(5), "detectDayNameBySwitch Friday");
        myDayOfTheWeekDetectorDemo.totalStringTest("Friday", myDayOfTheWeekDetector.detectDayNameFromList(5), "detectDayNameFromList Friday");

        myDayOfTheWeekDetectorDemo.totalStringTest("Sunday", myDayOfTheWeekDetector.detectDayName(7), "detectDayName Sunday");
        myDayOfTheWeekDetectorDemo.totalStringTest("Sunday", myDayOfTheWeekDetector.detectDayNameBySwitch(7), "detectDayNameBySwitch Sunday");
        myDayOfTheWeekDetectorDemo.totalStringTest("Sunday", myDayOfTheWeekDetector.detectDayNameFromList(7), "detectDayNameFromList Sunday");
    }

    void totalStringTest(String expectedValue, String actualValue, String testName) {

        if (expectedValue.equals(actualValue)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
            System.out.println("ExpectedValue=" + expectedValue);
            System.out.println("ActualValue=" + actualValue);
        }
    }
}
