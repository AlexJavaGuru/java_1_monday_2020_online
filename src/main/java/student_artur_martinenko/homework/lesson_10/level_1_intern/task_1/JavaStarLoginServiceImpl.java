package student_artur_martinenko.homework.lesson_10.level_1_intern.task_1;

import teacher.annotations.CodeReview;

/*
Дан класс:

class JavaStarLoginServiceImpl {

    public boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }

    private boolean notNull(String text) {
        return text != null;
    }

}

Создать интерфейс для данного класса под названием JavaStarLoginService.
Сделать так, чтобы класс JavaStarLoginServiceImpl имплементировал созданный вами интерфейс.
 */
@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
    public boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }

    private boolean notNull(String text) {
        return text != null;
    }

}
