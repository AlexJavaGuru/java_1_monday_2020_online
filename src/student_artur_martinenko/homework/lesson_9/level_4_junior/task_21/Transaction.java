package student_artur_martinenko.homework.lesson_9.level_4_junior.task_21;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    private Transaction(Trader trader) {
        this.trader = trader;
    }

    public Transaction(Trader trader, int amount) {
        FraudDetector fraudDetector = new FraudDetector();
        Transaction newTransaction = new Transaction(trader);
        if (fraudDetector.fraudNotDetected(newTransaction, amount)) {
            this.trader = trader;
            this.amount = amount;
        }
    }

    public Trader getTrader() {
        return new Trader(trader.getFullName(), trader.getCity(), trader.getCountry());
    }

    public int getAmount() {
        return amount;
    }

}
