package student_artur_martinenko.homework.lesson_9.level_6_middle.task_30_33;
/*
Продолжаем работу над системой автоматического обнаружения мошенничества.

Бизнес хочет, что бы обнаруженные мошеннические транзакции печатались на консоль
с полной информацией о них. Для этого переопределите у классов Trader и Transaction метод toString().
Воспользуйтесь переопределённым методом toString() объекта Transaction и при
обнаружении мошенничества в классе FraudDetector печатайте на консоль все свойства
транзакции (включая те которые находятся в классе Trader).
 */

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;

    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }

    public Trader getTrader() {
        return new Trader(trader.getFullName(), trader.getCity(), trader.getCountry());
    }

    public int getAmount() {
        return amount;
    }

}
