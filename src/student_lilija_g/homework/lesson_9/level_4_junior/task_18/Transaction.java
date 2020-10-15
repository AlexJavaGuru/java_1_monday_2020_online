package student_lilija_g.homework.lesson_9.level_4_junior.task_18;

class Transaction {

    private Trader trader;
    private int amount;

    private Transaction(Trader trader) {
        this.trader = trader;
    }

    public Transaction(Trader trader, int amount) {
        FraudDetector fraudDetector = new FraudDetector();
        Transaction newTransaction = new Transaction(trader);
        if (!fraudDetector.isFraud(newTransaction, amount)) {
            this.trader = trader;
            this.amount = amount;
        }
    }

    public Trader getTrader() {
        return new Trader(trader.getFullName(), trader.getCity());
    }

    public int getAmount() {
        return amount;
    }
}
