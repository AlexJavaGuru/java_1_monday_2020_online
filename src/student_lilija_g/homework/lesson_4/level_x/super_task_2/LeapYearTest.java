package student_lilija_g.homework.lesson_4.level_x.super_task_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Это не тесты. Это просто вывод на консоль")
public class LeapYearTest {

    public static void main(String[] args) {

        LeapYear myLeapYear = new LeapYear();

        LeapYearTest leapYearTest = new LeapYearTest();

        leapYearTest.totalTest(true, myLeapYear.isLeapYear(2020), "2020 true");
        leapYearTest.totalTest(false, myLeapYear.isLeapYear(2019), "2019 false");
        leapYearTest.totalTest(true,myLeapYear.isLeapYear(2016),"2016 true");
        leapYearTest.totalTest(false,myLeapYear.isLeapYear(2015),"2015 false");
        leapYearTest.totalTest(true,myLeapYear.isLeapYear(2000),"2000 true");
        leapYearTest.totalTest(false,myLeapYear.isLeapYear(1900),"1900 false");

    }

    void totalTest(boolean expectedValue, boolean actualValue, String testName) {
        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
