package student_lilija_g.homework.lesson_6.level_1.task_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Использовать в тестах сканнер не лучшая идея. Тесты должны быть полностью не зависимы от человека. Идея теста в том, чтобы исключить" +
        "человеческое вмешательство в работу теста, иначе, этот тест не стабилен.")
class DayOfTheWeekDetectorTest {

    DayOfTheWeekDetector myDayOfTheWeekDetector = new DayOfTheWeekDetector();

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest myDayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        myDayOfTheWeekDetectorTest.TestScenario();
    }

    void TestScenario() {
        totalTest("Monday", myDayOfTheWeekDetector.detectDayName(1), "Monday");
        totalTest("Tuesday", myDayOfTheWeekDetector.detectDayName(2), "Tuesday");
        totalTest("Wednesday", myDayOfTheWeekDetector.detectDayName(3), "Wednesday");
        totalTest("Thursday", myDayOfTheWeekDetector.detectDayName(4), "Thursday");
        totalTest("Friday", myDayOfTheWeekDetector.detectDayName(5), "Friday");
        totalTest("Saturday", myDayOfTheWeekDetector.detectDayName(6), "Saturday");
        totalTest("Sunday", myDayOfTheWeekDetector.detectDayName(7), "Sunday");
        totalTest("Please input a valid number between 1 and 7", myDayOfTheWeekDetector.detectDayName(10), "Incorrect input");
        totalTest("Please input a valid number between 1 and 7", myDayOfTheWeekDetector.detectDayName(0), "Incorrect input");

        System.out.print("Input integer number between 1 and 7 : ");

        Scanner myInput = new Scanner(System.in);
        int newNumber = myInput.nextInt();

        System.out.print(myDayOfTheWeekDetector.detectDayName(newNumber));
    }

    void totalTest(String expectedValue, String actualValue, String testName) {
        if (expectedValue.equals(actualValue)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }

    }
}
