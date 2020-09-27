package student_regina_svistunov.lesson_3.level_x;

public class UserLoginService {

    public boolean login(User user, String password) {

        if (!user.isBlocked() && user.getPassword().equals(password)) {
            user.reduceAttemptCount();
            return true;
        } else if (!user.isBlocked()) {
            if (user.reduceAttemptCount() <0) {
                user.blockUser();
                return false;
            }
        } else{
            return false;
        } return false;
    }
}
