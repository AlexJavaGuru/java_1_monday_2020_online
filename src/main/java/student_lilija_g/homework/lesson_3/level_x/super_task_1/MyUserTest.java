package student_lilija_g.homework.lesson_3.level_x.super_task_1;

import teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class MyUserTest {

    public static void main(String[] args) {

        User myUser = new User("javaguru", "abcd");

        int number = myUser.getAttemptsLeft();

        for (int i = 1; i <= number; i++) {
            myUser.isPasswordEquals("bcde");
            myUser.reduceLoginAttempts();
        }

        check(true, myUser.isBlocked(), "User is not logged in system - ");

        myUser.unblock();

        myUser.isPasswordEquals("abcd");
        check(false, myUser.isBlocked(), "User is logged in system - ");
    }

    private static void check(boolean expendedValue, boolean actualValue, String testName) {
        if (expendedValue == actualValue) {
            System.out.println("ExpendedValue = " + expendedValue + ", ActualValue = " + actualValue + ", " + testName + " OK");
        } else {
            System.out.println("ExpendedValue = " + expendedValue + ", ActualValue = " + actualValue + ", " + testName + " FAIL");
        }
    }

}


