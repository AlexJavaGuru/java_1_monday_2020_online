package student_dmitry_vasiliev.lesson_9.level_5;

/* - Task_24
        Изучаем Single Responsibility Principle.

        Вынесем код первого правила автоматического определения мошенничества в отдельный класс.

        Создайте класс FraudRule1:

        Напишите югит тесты для класса FraudRule1!*/

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }


    public boolean isFraud(Transaction t) {
        // Перенесите сюда код реализации первого правила из класса FraudDetector
        Trader trader = t.getTrader();
        if ("Pokemon".equals(trader.getFullName())){
            System.out.println("Transaction canceled - Pokemon is fraud name!");
            return true;
        } System.out.println("The transaction is safe!");
        return false;
    }

}


