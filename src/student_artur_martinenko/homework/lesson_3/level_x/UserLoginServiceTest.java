package student_artur_martinenko.homework.lesson_3.level_x;

public class UserLoginServiceTest {

    public static void main(String[] args) {
        User artur = new User("artur", "12345");
        UserLoginService userLoginService = new UserLoginService();

        boolean successfulLogin =  userLoginService.login(artur, "12345");
        boolean unSuccessfulLogin =  userLoginService.login(artur, "1234"); //attempt 1

        userLoginService.login(artur, "1234"); //attempt 2
        userLoginService.login(artur, "1234"); //attempt 3

        boolean blocked = artur.isBlocked();


        if (successfulLogin && !unSuccessfulLogin){
            System.out.println("User Login Service - PASSED");
        }else{
            System.out.println("User Login Service - NOT passed");
        }

        if (blocked){
            System.out.println("User Block - PASSED");
        }else{
            System.out.println("User Block - NOT passed");
        }


    }


}
