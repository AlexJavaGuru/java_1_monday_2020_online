package student_dmitry_vasiliev.lesson_9.level_5;

import teacher.annotations.CodeReview;

/* - Task_28
Изучаем Single Responsibility Principle.

        По аналогии с предыдущим заданием, выполните то же самое для
        второго правила автоматического определения мошенничества (class FraudRule5).
*/
@CodeReview(approved = true)
class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Germany".equals(trader.getCountry()) && t.getAmount() > 1000) {
            System.out.println("Transaction canceled - Germany with amount 1000 is fraud action!");
            return true;
        }
        System.out.println("The transaction is safe!");
        return false;
    }

}