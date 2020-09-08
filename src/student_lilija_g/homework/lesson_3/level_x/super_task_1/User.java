package student_lilija_g.homework.lesson_3.level_x.super_task_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class User {
	//Сами придумали? =)

	// Ответ:
	// Там же был в solutions.super_task_1 класс User, с которым надо было проделать соответствующие примеры...
	// Если бы решения не было, пробовала бы сама. Но мы же учимся, как правильно! Поэтому разобрала решение.
	// Что-то не так поняла... :(((

	private static final int MAX_ATTEMPTS_COUNT = 3;

    private String login;
    private String password;
    private boolean blocked;
    private int attemptsLeft;

    User(String login, String password){
        this.login = login;
        this.password = password;
        this.blocked = false;
        this.attemptsLeft = MAX_ATTEMPTS_COUNT;
    }

	boolean isBlocked() {
		return blocked;
	}

	void block(){
    	this.blocked = true;
	}

	void unblock() {

    	if (isBlocked()) {
			System.out.println("User is unblocked!"+"\n");      // Добавлено мною для себя
				}
			this.blocked = false;
			this.attemptsLeft = MAX_ATTEMPTS_COUNT;

	}

	int getAttemptsLeft() {
	    	return this.attemptsLeft;
	}

	boolean isPasswordEquals(String password) {
    	return this.password.equals(password);
	}

	void reduceLoginAttempts() {
    	this.attemptsLeft--;
		System.out.println("The entered password is incorrect, " + attemptsLeft + " attempts left"); // Добавлено мною для себя
    	if (attemptsLeft <= 0) {
			block();
			System.out.println("User is blocked. Contact technical support."+"\n"); // Добавлено мною для себя
		}
	}

}
