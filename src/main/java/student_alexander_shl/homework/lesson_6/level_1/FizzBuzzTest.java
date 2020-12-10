package student_alexander_shl.homework.lesson_6.level_1;

public class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzz myFizzBuzz = new FizzBuzz();

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.checkTest("FizzBuzz", myFizzBuzz.detect(30), "FizzBuzz");
        fizzBuzzTest.checkTest("Fizz", myFizzBuzz.detect(27), "Fizz");
        fizzBuzzTest.checkTest("Buzz", myFizzBuzz.detect(50), "Buzz");
        fizzBuzzTest.checkTest("11", myFizzBuzz.detect(11), "11");

        fizzBuzzTest.checkTest("FizzBuzz", myFizzBuzz.detectNew(30), "FizzBuzz");
        fizzBuzzTest.checkTest("Fizz", myFizzBuzz.detectNew(27), "Fizz");
        fizzBuzzTest.checkTest("Buzz", myFizzBuzz.detectNew(50), "Buzz");
        fizzBuzzTest.checkTest("11", myFizzBuzz.detectNew(11), "11");
    }

    void checkTest(String expectedValue, String realValue, String testName) {
        if (expectedValue.equals(realValue)) {
            System.out.println(testName + ": test = OK");
        } else {
            System.out.println(testName + ": test = WRONG");
            System.out.println("expectedValue = " + expectedValue);
            System.out.println("realValue = " + realValue);
        }
    }
}
