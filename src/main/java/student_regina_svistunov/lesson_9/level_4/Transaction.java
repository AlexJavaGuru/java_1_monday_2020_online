package student_regina_svistunov.lesson_9.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}
