package student_pjotrs_grezmanis.lesson_3.level_x;

import teacher.lesson_3.homework.level_x.solutions.super_task_1.User;

class UserLoginService {
 public boolean login(User user, String password){
  if (user.isBlocked()) {
   return false;
  }
  if (user.isPasswordEquals(password)) {
   user.unblock();
   return true;
  } else {
   user.reduceLoginAttempts();
   return false;
  }
 }
}
