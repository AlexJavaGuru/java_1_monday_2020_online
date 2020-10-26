package student_dmitry_vasiliev.lesson_6.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    FizzBuzz test = new FizzBuzz();

    public static void main(String[] args) {
         FizzBuzzTest myTest = new FizzBuzzTest();
         myTest.fBtests();
    }
        void fBtests () {
        generalCh ("FizzBuzz", test.detect(15), "FizzBuzz");
        generalCh ("Fizz", test.detect(3), "Fizz");
        generalCh ("Buzz", test.detect(5), "Buzz");
        generalCh ("FizzBuzz", test.detect(16), "FizzBuzz");
        generalCh ("Fizz", test.detect(4), "Fizz");
        generalCh ("Buzz", test.detect(6), "Buzz");

    }

    public void  generalCh (String actualValue, String expectedValue, String testName) {
        if (actualValue == expectedValue) {
            System.out.println("Test " + testName + " has passed.");
        } else {
            System.out.println("Test " + testName + " failed.");
        }
    }
}

