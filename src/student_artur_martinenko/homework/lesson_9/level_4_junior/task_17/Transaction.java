package student_artur_martinenko.homework.lesson_9.level_4_junior.task_17;


class Transaction {

    private Trader trader;
    private int amount;

    private Transaction(Trader trader) {
        this.trader = trader;
    }

    public Transaction(Trader trader, int amount) {
        if (notAFraud(new Transaction(trader))) {
            this.trader = trader;
            this.amount = amount;
        }
    }

    private boolean notAFraud(Transaction transaction) {
        FraudDetector fraudDetector = new FraudDetector();
        return !fraudDetector.isFraud(transaction);

    }

    public Trader getTrader() {
        return new Trader(trader.getFullName(), trader.getCity());
    }

    public int getAmount() {
        return amount;
    }

}
