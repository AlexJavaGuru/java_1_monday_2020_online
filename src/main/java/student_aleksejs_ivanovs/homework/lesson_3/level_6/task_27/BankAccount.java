package student_aleksejs_ivanovs.homework.lesson_3.level_6.task_27;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getMoney() {
        return String.valueOf(this.money);
    }
}
