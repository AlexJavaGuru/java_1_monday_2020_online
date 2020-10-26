package student_regina_svistunov.lesson_3.level_x;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class UserTest {

    public static void main(String[] args) {
        User regina = new User("Regina", "Qwerty");

        boolean isBlocked = regina.blockUser();

        regina.reduceAttemptCount();
        regina.reduceAttemptCount();
        regina.reduceAttemptCount();
        regina.resetAttemptCount();

        boolean resetAttempts;
        resetAttempts = regina.getAttemptCount() == 3;

        if (isBlocked && resetAttempts) {
            System.out.println("Test is passed!");
        } else {
            System.out.println("Test is failed!");
        }

    }

}