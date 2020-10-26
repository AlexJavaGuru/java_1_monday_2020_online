package student_regina_svistunov.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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

    public int getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + bankAccount.getOwner());
        System.out.println("Money = " + bankAccount.getMoney());
    }

}
