package student_lilija_g.homework.lesson_10.level_2_intern.task_5;

import java.util.Scanner;


class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector myDayOfTheWeekDetector;

    private final Scanner myScanner = new Scanner(System.in);

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector implementation) {
        this.myDayOfTheWeekDetector = implementation;
    }

    void run() {
        System.out.print("Please enter day number: ");
        int day = myScanner.nextInt();
        System.out.println("Day of week is " + myDayOfTheWeekDetector.detectDayName(day) + " ( Version = " + myDayOfTheWeekDetector.getClass().getSimpleName() + " )");
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

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo detectorIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        detectorIf.run();

        DayOfTheWeekDetectorDemo detectorSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        detectorSwitch.run();

        DayOfTheWeekDetectorDemo detectorList = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorListVersion());
        detectorList.run();
    }

}
