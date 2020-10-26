package student_regina_svistunov.lesson_3.level_x;

public class User {

    public String login;
    public String password;
    public Boolean isBlocked = false;
    public int attemptCount = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int reduceAttemptCount() {
        if (attemptCount > 1) {
            return attemptCount -= 1;
        }
        return -1;
    }

    public void resetAttemptCount() {
        this.attemptCount = 3;
    }

    public boolean blockUser() {
        return isBlocked = true;
    }

    public boolean unBlockUser() {
        return isBlocked = false;
    }


}
