package student_lilija_g.homework.lesson_9.level_5_middle.task_29;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    private Transaction(Trader trader) {
        this.trader = trader;
    }

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return new Trader(trader.getFullName(), trader.getCity(), trader.getCountry());
    }

    public int getAmount() {
        return amount;
    }
}
