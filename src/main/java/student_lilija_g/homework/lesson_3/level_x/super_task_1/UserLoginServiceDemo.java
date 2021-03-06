package student_lilija_g.homework.lesson_3.level_x.super_task_1;

/* Пример попыталась составить в соответствии с заданием:

Продемонстрировать работу классов (см. пример) в классе UserLoginServiceDemo.

Пример:
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");
        ​
        service.login(userOne, "user-password-12345"); //Should return false
        service.login(userOne, "user-password"); //Should return true
*/

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class UserLoginServiceDemo {

    public static void main(String[] args) {

        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");

        service.login(userOne, "user-password-12345");
        service.login(userOne, "user-password-12345");
        service.login(userOne, "user-password-12345");
        service.login(userOne, "user-password");

        userOne.unblock();
        service.login(userOne, "user-password");

    }
}




