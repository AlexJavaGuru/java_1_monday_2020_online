package student_regina_svistunov.lesson_3.level_x;

class UserLoginServiceTest {

    public static void main(String[] args) {
        User regina = new User("Regina", "qwerty");
        UserLoginService userLoginService = new UserLoginService();

        boolean successfulLogin = userLoginService.login(regina, "qwerty");
        boolean unSuccessfulLogin = userLoginService.login(regina, "qwety");

        userLoginService.login(regina, "qwery");
        userLoginService.login(regina, "werty");

        boolean blocked = regina.isBlocked();

        if (successfulLogin && !unSuccessfulLogin) {
            System.out.println("Login service is passed!");
        } else {
            System.out.println("Login service is failed!");
        }

        if (blocked) {
            System.out.println("Blocked service is passed!");
        } else {
            System.out.println("Blocked service is failed!");
        }

    }

}