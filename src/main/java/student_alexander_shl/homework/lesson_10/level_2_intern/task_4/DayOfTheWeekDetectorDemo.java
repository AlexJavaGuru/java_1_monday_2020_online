package student_alexander_shl.homework.lesson_10.level_2_intern.task_4;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {

        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo();

        demo.checkTestString("Monday", detector.detectDayName(1), "detectDayName Monday");
        demo.checkTestString("Monday", detector.detectDayNameBySwitch(1), "detectDayNameBySwitch Monday");
        demo.checkTestString("Monday", detector.detectDayNameFromList(1), "detectDayNameFromList Monday");

        demo.checkTestString("Sunday", detector.detectDayName(7), "detectDayName Sunday");
        demo.checkTestString("Sunday", detector.detectDayNameBySwitch(7), "detectDayNameBySwitch Sunday");
        demo.checkTestString("Sunday", detector.detectDayNameFromList(7), "detectDayNameFromList Sunday");
    }

    void checkTestString(String value, String realValue, String testName) {

        if (value.equals(realValue)) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("Value=" + value);
            System.out.println("RealValue=" + realValue);
        }
    }
}
