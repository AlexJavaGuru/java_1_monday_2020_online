package student_artur_martinenko.homework.lesson_9.level_5_middle.task_29;


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


}
