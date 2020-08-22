package student_lilija_g.homework.lesson_3.level_x.super_task_1;

class User {
	//Сами придумали? =)
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
			System.out.println("User is unblocked!"+"\n");
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
		System.out.println("The entered password is incorrect, " + attemptsLeft + " attempts left");
    	if (attemptsLeft <= 0) {
			block();
			System.out.println("User is blocked. Contact technical support."+"\n");
		}
	}

}
