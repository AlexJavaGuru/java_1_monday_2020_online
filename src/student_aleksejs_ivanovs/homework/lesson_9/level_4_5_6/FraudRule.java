package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

/* Task_23
Изучаем Single Responsibility Principle.

Продолжаем работу над кодом из предыдущего задания.

Одна из возможностей упростить класс FraudDetector кроектся в снятии с него
ответственности за реализацию каждого правила обнаружения мошенничества.
Каждое правило - это по сути отдельная программа, которая может быть выполнена
в независимости от всех остальных правил.

Предлагаем код каждого правила реализовать в собственном классе!

Для этого создайте абстрактный класс FraudRule.

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}*/
//-------------------------------------------------------------------------------------------------------------------//
/*  Task_31
Продолжаем работу над системой автоматического обнаружения мошенничества.

В абстрактном классе FraudRule реализуйте get() метод для свойства ruleName:

    String getRuleName();*/

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
