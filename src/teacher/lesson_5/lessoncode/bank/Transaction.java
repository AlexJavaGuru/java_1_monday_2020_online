package teacher.lesson_5.lessoncode.bank;

public class Transaction {

    private boolean incomingAmount;
    private int amount;

    public Transaction(boolean incomingAmount, int amount) {
        this.incomingAmount = incomingAmount;
        this.amount = amount;
    }

    public boolean isIncomingAmount() {
        return incomingAmount;
    }

    public int getAmount() {
        return amount;
    }
}
