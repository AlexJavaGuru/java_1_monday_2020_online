package student_lilija_g.homework.lesson_3.level_x.super_task_1;
//Ох =) как трудно читать ваши методы тут. Есть такое правило хорошего стиля: один тест - один assertion (в вашем случае один checkResults =))

// код был взят из solutions.super_task_1... Для того, чтобы в нем разобраться и понять, как работает были мною вставлены в классы User, UserLoginService System.out.println...

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "код был взят из solutions.super_task_1... Для того, чтобы в нем разобраться и понять, как работает были мною вставлены в классы User, UserLoginService System.out.println..." +
		"Смотрите, я бы хотел чтобы вы писали код сами, ручками. Не надо брать код чтобы потом разобраться. Надо писать его самостоятельно и понимать каждую строчку, которую вы пишите." +
		"Этот репозиторий не удалиться, когда вы закончите курс, и этот пример всегда будет там даже на вашем локальном git. Так что просто нет смысла копировать их. Я же проверяю ваши домашние работы," +
		"а тут готовый чей-то код =)")
class UserLoginServiceTest {

	public static void main(String[] args) {
		UserLoginServiceTest test = new UserLoginServiceTest();

		test.shouldSuccessfullyLogin();
		test.shouldLoginFail_attempts_2();
		test.shouldLoginFail_attempts_1();
		test.shouldLoginFail_attempts_0();
		test.shouldSetAttemptsLeftTo3AfterSuccessfulLogin();
	}

	void shouldSuccessfullyLogin() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
		boolean loginSuccessfully = service.login(user, "abcd");
		checkResults(loginSuccessfully, "shouldSuccessfullyLogin");
		checkResults(!user.isBlocked(), "shouldSuccessfullyLogin");
	}

	void shouldLoginFail_attempts_2() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
		boolean loginSuccessfully = service.login(user, "incorrect password");
		checkResults(!loginSuccessfully, "shouldLoginFail_attempts_2");
		checkResults(user.getAttemptsLeft() == 2, "shouldLoginFail_attempts_2");
		checkResults(!user.isBlocked(), "shouldLoginFail_attempts_2");
	}

	void shouldLoginFail_attempts_1() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
		service.login(user, "incorrect password");
		boolean loginSuccessfully = service.login(user, "incorrect password");
		checkResults(!loginSuccessfully, "shouldLoginFail_attempts_1");
		checkResults(user.getAttemptsLeft() == 1, "shouldLoginFail_attempts_1");
		checkResults(!user.isBlocked(), "shouldLoginFail_attempts_1");
	}

	void shouldLoginFail_attempts_0() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
		service.login(user, "incorrect password");
		service.login(user, "incorrect password");
		boolean loginSuccessfully = service.login(user, "incorrect password");
		checkResults(!loginSuccessfully, "shouldLoginFail_attempts_0");
		checkResults(user.getAttemptsLeft() == 0, "shouldLoginFail_attempts_0");
		checkResults(user.isBlocked(), "shouldLoginFail_attempts_0");
	}

	void shouldSetAttemptsLeftTo3AfterSuccessfulLogin() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
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
	}

}
