package student_artur_martinenko.homework.lesson_9.level_5_middle.task_22_28;

import java.util.ArrayList;

/*
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

}
 */

/*
Изучаем Single Responsibility Principle.

Вынесем код первого правила автоматического определения мошенничества в отдельный класс.

Создайте класс FraudRule1:

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        // Перенесите сюда код реализации первого правила из класса FraudDetector
    }

}

Напишите югит тесты для класса FraudRule1!
 */

//Александр, это пищет будующий Артур, выполнивший это задание до конца ))
//Прошу не судить строго за нестандартность выбранного мною решений. Код эволюционирует с каждым новым заданием.

class FraudDetector {




}

