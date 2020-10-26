package student_artur_martinenko.homework.lesson_3.level_x;

class UserLoginService {

    public boolean login(User user, String password) {

        if (!user.isBlocked() && user.getPassword().equals(password)) {
//            System.out.println("Login successful.");
            user.resetAttemptCount();
            return true;
        } else if(!user.isBlocked()) {
//            System.out.println("Login unsuccessful. Attempts remain " + user.getAttemptCount());
            if (user.reduceAttemptCount() < 0) {
//                System.out.println("User blocked.");
                user.blockUser();
                return false;
            }
        }else{
//            System.out.println("User blocked.");
            return false;
        }

        return false;
    }

}
