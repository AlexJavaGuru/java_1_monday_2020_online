package student_lilija_g.homework.lesson_3.level_6.task_27;

class BankAccount {

    private String owner;
    private int money;

    BankAccount(String ownerFirstName,int moneyAmount) {
        this.owner = ownerFirstName;
        this.money = moneyAmount;
        }

    String getOwner() {
        return owner;
    }

    String getMoney() {
        return String.valueOf(this.money);
    }

}


