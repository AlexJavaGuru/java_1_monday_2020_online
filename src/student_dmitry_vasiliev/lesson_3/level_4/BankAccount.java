package student_dmitry_vasiliev.lesson_3.level_4;

class BankAccount {
    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName,
                       String ownerLastName,
                       int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }
    public String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    public String getOwnerLastName() {
        return this.ownerLastName;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
