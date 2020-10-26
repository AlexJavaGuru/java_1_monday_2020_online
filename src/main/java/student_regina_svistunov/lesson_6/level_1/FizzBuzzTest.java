package student_regina_svistunov.lesson_6.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.isFizzBuzzTest();
        fizzBuzzTest.isFizzTest();
        fizzBuzzTest.isBuzzTest();
        fizzBuzzTest.isOtherNumberTest();


    }

    void check(boolean result, String testName) {
        if (result) {
            System.out.println("Test " + testName + " is passed!");
        } else {
            System.out.println("Test " + testName + "is failed!");
        }
    }
    void isFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(15).equals("FizzBuzz"), " FizzBuzzTest");
    }
    void isFizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(27).equals("Fizz"), " FizzTest" );
    }
    void isBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(25).equals("Buzz"), " BuzzTest");
    }
    void isOtherNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(46).equals("46"), " OtherNumberTest");
    }

}