package student_regina_svistunov.lesson_3.level_x;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Почти хорошо. Надо подумать над логикой. Подумать вот в каком плане - Метод reduceAttemptCount не должен ничего возвращать." +
        "Он должен просто изменить состояние объекта. Убрать ему одну попытку. А так же, зачем отнимать попытку, если вход успешный?")
public class UserLoginService {

    public boolean login(User user, String password) {

        if (!user.isBlocked() && user.getPassword().equals(password)) {
            user.reduceAttemptCount();
            return true;
        } else if (!user.isBlocked()) {
            if (user.reduceAttemptCount() < 0) {
                user.blockUser();
                return false;
            }
        } else {
            return false;
        }
        return false;
    }
}
