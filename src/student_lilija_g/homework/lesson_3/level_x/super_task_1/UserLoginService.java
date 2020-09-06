package student_lilija_g.homework.lesson_3.level_x.super_task_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class UserLoginService {

	boolean login(User user, String password) {
		if (user.isBlocked()) {
			System.out.println("User is blocked. Contact technical support." + "\n"); // Добавлено мною для себя
			return false;

		} else {
			if (user.isPasswordEquals(password)) {
				user.unblock();
				System.out.println("Password is correct!"); // Добавлено мною для себя
				return true;

			} else {
				user.reduceLoginAttempts();
				return false;
			}
		}
	}

}