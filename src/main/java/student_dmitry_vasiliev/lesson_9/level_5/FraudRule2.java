package student_dmitry_vasiliev.lesson_9.level_5;

/* - Task_25
Изучаем Single Responsibility Principle.

        По аналогии с предыдущим заданием, выполните то же самое для
        второго правила автоматического определения мошенничества (class FraudRule2).
*/
class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (t.getAmount() > 1000000) {
            System.out.println("Transaction canceled - amount greater than 1000000!");
            return true;
        }
        System.out.println("The transaction is safe!");
        return false;
    }

}
