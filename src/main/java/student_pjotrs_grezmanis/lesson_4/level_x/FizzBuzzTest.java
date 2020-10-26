package student_pjotrs_grezmanis.lesson_4.level_x;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest ringtone = new FizzBuzzTest();
        ringtone.testFizzBuzz();
        ringtone.testFizz();
        ringtone.testBuzz();
        ringtone.failTestFizzBuzz();
    }

    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        if ("FizzBuzz".equals(fizzBuzz.detect(15))) {
            System.out.println("testFizzBuzz() - OK");

        } else {
            System.out.println("testFizzBuzz() - FAILED");
        }
    }

    public void testFizz() {
        FizzBuzz fizz = new FizzBuzz();

        if ("Fizz".equals(fizz.detect(9))) {
            System.out.println("testFizz() - OK");
        } else {
            System.out.println("testFizz() - FAILED");
        }

    }

    public void testBuzz() {
        FizzBuzz buzz = new FizzBuzz();
        if ("Buzz".equals(buzz.detect(20))) {
            System.out.println("testBuzz() - OK");
        } else {
            System.out.println("testBuzz() - FAILED");
        }
    }

    public void failTestFizzBuzz() {
        FizzBuzz buzz = new FizzBuzz();
        if ("8".equals(buzz.detect(8))) {
            System.out.println("failTestFizzBuzz() - OK");
        } else {
            System.out.println("failTestFizzBuzz() - FAILED");
        }
    }
}
