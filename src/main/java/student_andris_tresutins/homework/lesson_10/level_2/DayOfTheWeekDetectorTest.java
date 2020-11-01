package student_andris_tresutins.homework.lesson_10.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.DayOfTheWeekSwitch();
        test.DayOfTheWeekArray();
        test.DayOfTheWeekIf();
    }
    public void DayOfTheWeekSwitch(){

        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        boolean result = victim.detectDayName(1).equals("Monday");
        boolean expected = true;
        check(expected,result,"Switch test");

    }

    public void DayOfTheWeekArray(){

        DayOfTheWeekDetectorArrayVersion victim = new DayOfTheWeekDetectorArrayVersion();
        boolean result = victim.detectDayName(2).equals("Tuesday");
        boolean expected = true;
        check(expected,result,"Array test");

    }

    public void DayOfTheWeekIf(){

        DayOfTheWeekDetectorIfVersion victim = new DayOfTheWeekDetectorIfVersion();
        boolean result = victim.detectDayName(3).equals("Wednesday");
        boolean expected = true;
        check(expected,result,"If test");

    }

    public void check(boolean expectedResult, boolean actual, String testName) {
        if (expectedResult == actual) {
            System.out.println(testName + " Test Has Passed");
        } else {
            System.out.println(testName + " Test Has Failed");
            System.out.println("The result was : " + actual);
            System.out.println("expected : " + expectedResult);
        }

    }
}
