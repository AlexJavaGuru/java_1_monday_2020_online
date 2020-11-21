package student_andris_tresutins.homework.Lesson_12.level_3;

import teacher.annotations.CodeReview;

class TestException extends Exception { }

@CodeReview(approved = true)
class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
// 2. and 3.
