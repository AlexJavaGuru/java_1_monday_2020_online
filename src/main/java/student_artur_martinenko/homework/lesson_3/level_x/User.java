package student_artur_martinenko.homework.lesson_3.level_x;

class User {
    private String login;
    private String password;
    private boolean isBlocked = false;
    private int attemptCount = 3;

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

    public int resetAttemptCount(){
        return this.attemptCount = 3;
    }

    public boolean blockUser(){
        return isBlocked = true;
    }

    public boolean unBlockUser(){
        return isBlocked = false;
    }


}
