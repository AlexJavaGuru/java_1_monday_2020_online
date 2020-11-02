package student_dmitry_vasiliev.lesson_9.level_5;

import teacher.annotations.CodeReview;

/* - Task_26
Изучаем Single Responsibility Principle.

        По аналогии с предыдущим заданием, выполните то же самое для
        второго правила автоматического определения мошенничества (class FraudRule3).
*/
@CodeReview(approved = true)
class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Sidney".equals(trader.getCity())) {
            System.out.println("Transaction canceled - Sidney is fraud city!");
            return true;
        }
        System.out.println("The transaction is safe!");
        return false;
    }

}