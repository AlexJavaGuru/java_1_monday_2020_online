package student_alexander_shl.homework.lesson_3.level_6.task_27;
/*
Найти логическую ошибку в коде.
Исправить и запустить программу так, что бы она выводила
на консоль владельца банковского счёта и количество денег.
Менять можно только класс BankAccount.

class BankAccount {

    privateString owner;
    private int money;

    public BankAccount(int moneyAmount) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}

Примечание: без изменения BankAccountDemo НЕ смог решить задачу!

 */
class BankAccount {

    public String owner; // privateString -> public String
    public int money; // private int -> public int

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money; // добавлен, так как в Демо вызов 2-мя параметрами
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() { // void -> int
        return this.money;
    }

}
