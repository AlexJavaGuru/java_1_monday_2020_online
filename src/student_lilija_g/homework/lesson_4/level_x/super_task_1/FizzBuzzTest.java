package student_lilija_g.homework.lesson_4.level_x.super_task_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Это не тесты. Это просто вывод на консоль")
public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzz myFizzBuzz = new FizzBuzz();

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.totalTest("Fizz",myFizzBuzz.detect(3),"Fizz");
        fizzBuzzTest.totalTest("Buzz",myFizzBuzz.detect(5),"Buzz");
        fizzBuzzTest.totalTest("FizzBuzz",myFizzBuzz.detect(15),"FizzBuzz");
        fizzBuzzTest.totalTest("number",myFizzBuzz.detect(17),"17");

    }

    void totalTest(String expectedValue, String actualValue, String testName) {
        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}