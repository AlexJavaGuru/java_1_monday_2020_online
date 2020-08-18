package student_artur_martinenko.homework.lesson_3.level_x;

public class UserTest {
    public static void main(String[] args) {
        User artur = new User("artur", "12345");

        boolean isBlocked = artur.blockUser();

        artur.reduceAttemptCount();
        artur.reduceAttemptCount();
        artur.reduceAttemptCount();
        artur.resetAttemptCount();

        boolean resetAttempts;
        if(artur.getAttemptCount() == 3) {
            resetAttempts = true;
        }else {
            resetAttempts = false;
        }

        if (isBlocked && resetAttempts){
            System.out.println("User Test - passed");
        }else{
            System.out.println("User Test - not passed");
        }
    }
}
