package student_pjotrs_grezmanis.lesson_3.level_x;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Почему все закоментировано? Надо чтобы все работало. Тут вы тоже используете чужие классы:" +
        "teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService() - к примеру мой сервис. Внимательно смотрите, что вы используете у себя в программе." +
        "" +
        "Ничего не поменялось. ")
class UserLoginServiceTest {
 public static void main(String[] args) {

  /*test.shouldSuccessfullyLogin();
  test.shouldLoginFail_attempts_2();
  test.shouldLoginFail_attempts_1();
  test.shouldLoginFail_attempts_0();
  test.shouldSetAttemptsLeftTo3AfterSuccessfulLogin();
 }

 public void shouldSuccessfullyLogin() {
  teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService service = new teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService();
  teacher.lesson_3.homework.level_x.solutions.super_task_1.User user = new teacher.lesson_3.homework.level_x.solutions.super_task_1.User("javaguru", "abcd");
  boolean loginSuccessfully = service.login(user, "abcd");
  checkResults(loginSuccessfully, "shouldSuccessfullyLogin");
  checkResults(!user.isBlocked(), "shouldSuccessfullyLogin");
 }

 public void shouldLoginFail_attempts_2() {
  teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService service = new teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService();
  teacher.lesson_3.homework.level_x.solutions.super_task_1.User user = new teacher.lesson_3.homework.level_x.solutions.super_task_1.User("javaguru", "abcd");
  boolean loginSuccessfully = service.login(user, "incorrect password");
  checkResults(!loginSuccessfully, "shouldLoginFail_attempts_2");
  checkResults(user.getAttemptsLeft() == 2, "shouldLoginFail_attempts_2");
  checkResults(!user.isBlocked(), "shouldLoginFail_attempts_2");
 }

 public void shouldLoginFail_attempts_1() {
  teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService service = new teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService();
  teacher.lesson_3.homework.level_x.solutions.super_task_1.User user = new teacher.lesson_3.homework.level_x.solutions.super_task_1.User("javaguru", "abcd");
  service.login(user, "incorrect password");
  boolean loginSuccessfully = service.login(user, "incorrect password");
  checkResults(!loginSuccessfully, "shouldLoginFail_attempts_1");
  checkResults(user.getAttemptsLeft() == 1, "shouldLoginFail_attempts_1");
  checkResults(!user.isBlocked(), "shouldLoginFail_attempts_1");
 }

 public void shouldLoginFail_attempts_0() {
  teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService service = new teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService();
  teacher.lesson_3.homework.level_x.solutions.super_task_1.User user = new teacher.lesson_3.homework.level_x.solutions.super_task_1.User("javaguru", "abcd");
  service.login(user, "incorrect password");
  service.login(user, "incorrect password");
  boolean loginSuccessfully = service.login(user, "incorrect password");
  checkResults(!loginSuccessfully, "shouldLoginFail_attempts_0");
  checkResults(user.getAttemptsLeft() == 0, "shouldLoginFail_attempts_0");
  checkResults(user.isBlocked(), "shouldLoginFail_attempts_0");
 }

 public void shouldSetAttemptsLeftTo3AfterSuccessfulLogin() {
  teacher.lesson_3.homework.level_x.solutions.super_task_1.UserLoginService service = new UserLoginService();
  teacher.lesson_3.homework.level_x.solutions.super_task_1.User user = new User("javaguru", "abcd");
  service.login(user, "incorrect password");
  service.login(user, "incorrect password");
  checkResults(user.getAttemptsLeft() == 1, "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
  boolean loginSuccessfully = service.login(user, "abcd");
  checkResults(loginSuccessfully, "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
  checkResults(user.getAttemptsLeft() == 3, "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
  checkResults(!user.isBlocked(), "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
 }

 private void checkResults(boolean condition, String testName) {
  if (condition) {
   System.out.println(testName + " = OK");
  } else {
   System.out.println(testName + " = FAIL");
  }

  */
 }


}
