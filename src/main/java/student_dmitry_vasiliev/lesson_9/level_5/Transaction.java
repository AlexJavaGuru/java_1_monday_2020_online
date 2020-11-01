package student_dmitry_vasiliev.lesson_9.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    Transaction (Trader trader, int amount){
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
