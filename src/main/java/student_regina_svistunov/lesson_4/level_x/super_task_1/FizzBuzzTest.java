package student_regina_svistunov.lesson_4.level_x.super_task_1;

import java.util.Objects;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzz test = new FizzBuzz();

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.totalTest("Fizz",test.detect(3),"Fizz");
        fizzBuzzTest.totalTest("Buzz",test.detect(5),"Buzz");
        fizzBuzzTest.totalTest("FizzBuzz", test.detect(15), "FizzBuzz");
        fizzBuzzTest.totalTest("number",test.detect(22),"22");
    }


    void totalTest(String expectedResult, String actualValue, String testName) {
        if (Objects.equals(expectedResult, actualValue)) {
            System.out.println(testName + " test is PASSED");
        } else {
            System.out.println(testName + " test is FAILED");
        }
    }


}
