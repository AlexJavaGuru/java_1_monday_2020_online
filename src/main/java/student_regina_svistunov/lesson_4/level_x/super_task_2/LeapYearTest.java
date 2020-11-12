 package student_regina_svistunov.lesson_4.level_x.super_task_2;

 import teacher.annotations.CodeReview;

 //    Создать класс для тестов LeapYearTest
//        и покрыть тестами весь функционал класса LeapYear.
@CodeReview(approved = true)
public class LeapYearTest {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();

        LeapYearTest leapYearTest = new LeapYearTest();

        leapYearTest.test(true, leapYear.isLeapYear(2020),"2020");
        leapYearTest.test(false,leapYear.isLeapYear(2017),"2017");
        leapYearTest.test(true, leapYear.isLeapYear(2016),"2016");
        leapYearTest.test(false, leapYear.isLeapYear(2011),"2011");


    }

    void test(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " leap year test is PASSED");
        } else {
            System.out.println(testName + " leap year test is FAILED");
        }
    }


}