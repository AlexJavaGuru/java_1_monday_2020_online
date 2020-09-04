package student_lilija_g.homework.lesson_6.level_1.task_3;

public class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzz myFizzBuzz = new FizzBuzz();

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.totalTest("FizzBuzz",myFizzBuzz.detect(15),"FizzBuzz");
        fizzBuzzTest.totalTest("Fizz",myFizzBuzz.detect(9),"Fizz");
        fizzBuzzTest.totalTest("Buzz",myFizzBuzz.detect(25),"Buzz");
        fizzBuzzTest.totalTest("19",myFizzBuzz.detect(19),"19");
    }

    void totalTest(String expectedValue, String actualValue, String testName) {
        if (expectedValue.equals(actualValue)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}

