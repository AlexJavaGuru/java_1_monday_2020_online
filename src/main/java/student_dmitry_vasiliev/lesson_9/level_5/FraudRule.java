package student_dmitry_vasiliev.lesson_9.level_5;

import teacher.annotations.CodeReview;

/* - Task_23
        Изучаем Single Responsibility Principle.

        Продолжаем работу над кодом из предыдущего задания.

        Одна из возможностей упростить класс FraudDetector кроектся в снятии с него
        ответственности за реализацию каждого правила обнаружения мошенничества.
        Каждое правило - это по сути отдельная программа, которая может быть выполнена
        в независимости от всех остальных правил.

        Предлагаем код каждого правила реализовать в собственном классе!

        Для этого создайте абстрактный класс FraudRule.*/
@CodeReview(approved = true)
abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }

}
