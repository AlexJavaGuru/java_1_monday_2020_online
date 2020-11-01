package student_dmitry_vasiliev.lesson_9.level_5;

import teacher.annotations.CodeReview;

/* - Task_27
Изучаем Single Responsibility Principle.

        По аналогии с предыдущим заданием, выполните то же самое для
        второго правила автоматического определения мошенничества (class FraudRule4).
*/
@CodeReview(approved = true)
class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Jamaica".equals(trader.getCountry())) {
            System.out.println("Transaction canceled - Jamaica is fraud country!");
            return true;
        }
        System.out.println("The transaction is safe!");
        return false;
    }

}
