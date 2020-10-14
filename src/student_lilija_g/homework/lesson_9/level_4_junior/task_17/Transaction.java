package student_lilija_g.homework.lesson_9.level_4_junior.task_17;

class Transaction {

    private Trader trader;
    private int amount;

    private Transaction(Trader trader) {
        this.trader = trader;
    }

    public Transaction(Trader trader, int amount) {
        FraudDetector fraudDetector = new FraudDetector();
        if (!fraudDetector.isFraud(new Transaction(trader))) {
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
