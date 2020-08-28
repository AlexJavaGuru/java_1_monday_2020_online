package student_lilija_g.homework.lesson_3.level_x.super_task_1;

public class MyUserLoginServiceTest {

    public static void main(String[] args) {

        UserLoginService myUserLoginService = new UserLoginService();
        User myUser = new User("javaguru", "abcd");

        myCheck(false, myUser.isPasswordEquals("bcde"), "Password not correct");
        myCheck(true, myUser.isPasswordEquals("abcd"), "Password correct");
        myCheck(false, myUser.isBlocked(), "Is blocked test OK");

        myUserLoginService.login(myUser, "abcd");

        myUserLoginService.login(myUser, "bcde");
        myUserLoginService.login(myUser, "bcde");
        myUserLoginService.login(myUser, "bcde");

        myCheck(true, myUser.isBlocked(), "Is blocked test OK");

        myUser.unblock();

        myCheck(false, myUser.isBlocked(), "Is blocked test FAIL");

        myUserLoginService.login(myUser, "abcd");
        myCheck(true, myUser.isPasswordEquals("abcd"), "Password correct");
    }

    private static void myCheck(boolean expended, boolean actual, String testName) {
        if (expended == actual) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
