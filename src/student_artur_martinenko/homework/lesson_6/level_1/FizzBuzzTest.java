package student_artur_martinenko.homework.lesson_6.level_1;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.isFizzBuzzTest();
        fizzBuzzTest.isFizzTest();
        fizzBuzzTest.isBuzzTest();
        fizzBuzzTest.isOtherNumberTest();

    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println("Test " + testName + " - OK");
        } else {
            System.out.println("Test " + testName + " - FAILED");
        }
    }

    public void isFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(45).equals("FizzBuzz"), "isFizzBuzzTest");
    }

    public void isFizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(9).equals("Fizz"), "isFizzTest");
    }

    public void isBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(40).equals("Buzz"), "isBuzzTest");
    }

    public void isOtherNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(101).equals("101"), "isOtherNumberTest");
    }

}
