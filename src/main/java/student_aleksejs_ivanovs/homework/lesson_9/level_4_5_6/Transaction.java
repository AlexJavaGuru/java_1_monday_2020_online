package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

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

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }

}
