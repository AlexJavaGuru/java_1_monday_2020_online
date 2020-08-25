package teacher.lesson_5.lessoncode.bank;

public class BankAccount {

    private String holderName;
    private int money;

    public BankAccount(String holderName) {
        this.holderName = holderName;
        this.money = 0;
    }

    public void executeTransaction(Transaction[] transactions) {
        for (int i = 0; i < transactions.length; i++) {
            Transaction transaction = transactions[i];

            if (transaction.isIncomingAmount()) {
                money += transaction.getAmount();
            } else {
                money -= transaction.getAmount();
            }
            //hacking bank
//            transactions[i] = null;
        }
    }

    public String getHolderName() {
        return holderName;
    }

    public int getMoney() {
        return money;
    }

    public void printInformation() {
        System.out.println("Bank Account:");
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + money);
    }
}
