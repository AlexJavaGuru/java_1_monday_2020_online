package student_renars_ranka.homework.lesson_6.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.isFizzBuzzTest();
        fizzBuzzTest.isFizzTest();
        fizzBuzzTest.isBuzzTest();
        fizzBuzzTest.isUnrecognizedNumber();
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - PASSED!" );
        } else {
            System.out.println(testName + " - FAILED!");
        }
    }

    public void isFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(15).equals("FizzBuzz"), "Is Fizz Buzz Test");
    }

    public void isFizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(21).equals("Fizz"), "Is Fizz Test");
    }
    public void isBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(100).equals("Buzz"), "Is Buzz Test");
    }
    public void isUnrecognizedNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(0).equals("5"), "Is Unrecognized Number Test");
    }

}
