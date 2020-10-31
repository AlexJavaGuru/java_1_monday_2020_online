package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

/*  Task_17
Изучаем Single Responsibility Principle.

Ниже приведён неполный код системы обработки транзакций.
Вам будет необходимо внести в него изменения и доработать его
согласно бизнес требованиям.
Каждая транзакция в системе должна быть проверена на мошенничество (fraud).
Для автоматического обнаружения мошенничества при проверке транзакций
в систему нужно добавить правила, которые будут приведены ниже.

class Trader {

    private String fullName;
    private String city;

}


class Transaction {

    private Trader trader;
    private int amount;

}


class FraudDetector {

    boolean isFraud(Transaction t) {

    }

}

Реализуйте первое правило для автоматического обнаружения мошенничества:
- Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены. // Task_17
- Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.                             // Task_18
- Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.                        // Task_19
- Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.                       // Task_20
- Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.          // Task_21

Внесите в код указанный выше любые изменения, которые вы считаете нужными для того,
чтобы реализовать правило указанное выше.
Напишите тесты, которые доказывают, что ваше решение работает правильно!*/
//-------------------------------------------------------------------------------------------------------------------\\
/*  Task_29
Изучаем Single Responsibility Principle.

Пришло время воспользоваться отдельными классами правил обнаружения мошенничества.

Создайте в классе FraudDetector конструктор, который принимает
массив или список объектов типа FraudRule. Через этот конструктор
в класс FraudDetector будут подаваться все автоматические правила
определения мошенничества, которые реализованы отдельными классами.

Исправьте код метода FraudDetector.isFraud(Transaction t).
Логика этого метода будет очень проста: проити по всем FraudRule,
применить его для транзакции и если хоть одно правило обнаружить
мошенничество то вернуть true (да эта транзакция является мошенничеством),
иначе вернуть false (транзакция чистая, ни одно правило не сработало).

Теперь у класса FraudDetector новая ответственность - это последовательное
применение каждого правила для проверяемой транзакции. Код класса FraudDetector
стал небольшим, от не будет меняться с ростом числа правил обнаружения мошеннисества!

Исправьте тесты согласно новой реализации класса FraudDetector!*/
//-------------------------------------------------------------------------------------------------------------------\\
/*  Task_32
Продолжаем работу над системой автоматического обнаружения мошенничества.

Поменяйте тип возвращаемого значения у метода FraudDetector.isFraud(Transaction t)
c boolean на FraudDetectionResult и внесите нужные изменения в код программы и тесты.

Теперь при срабатывании одного из правил определения мошенничества, вы можете
у самого правила узнать его название. Для этого достаточто будет вызвать метод
getRuleName() у объекта FraudRule. Полученное таким образом название правила
вы вернёте в качестве результата в объекте FraudDetectionResult.*/
//-------------------------------------------------------------------------------------------------------------------\\
/*  Task_33
Продолжаем работу над системой автоматического обнаружения мошенничества.

Бизнес хочет, что бы обнаруженные мошеннические транзакции печатались на консоль
с полной информацией о них. Для этого переопределите у классов Trader и Transaction метод toString().
Воспользуйтесь переопределённым методом toString() объекта Transaction и при
обнаружении мошенничества в классе FraudDetector печатайте на консоль все свойства
транзакции (включая те которые находятся в классе Trader).*/

import teacher.annotations.CodeReview;

import java.util.ArrayList;
@CodeReview(approved = true)
class FraudDetector {

    /*boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {   // Task_17
            return true;
        }
        else if (t.getAmount() == 1000000) {                   // Task_18
            return true;
        }
        else if (t.getTrader().getCity().equals("Sidney")) {   // Task_19
            return true;
        }
        else if (t.getTrader().getCountry().equals("Jamaica")) {   // Task_20
            return true;
        }
        else return t.getTrader().getCountry().equals("Germany") && t.getAmount() == 1000;   // Task_21
    }*/

    // Task_29
    public ArrayList<FraudRule> fraudRules;

    public FraudDetector() {
        fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1("Rule1"));
        fraudRules.add(new FraudRule2("Rul2"));
        fraudRules.add(new FraudRule3("Rul3"));
        fraudRules.add(new FraudRule4("Rul4"));
        fraudRules.add(new FraudRule5("Rul5"));
    }

    /*public boolean isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                return true;
            }
        }
        return false;
    }*/

    //  Task_32
    public FraudDetectionResult isFraud(Transaction transaction) {
        boolean fraud = false;
        String ruleName = null;

        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                fraud = true;
                ruleName = fraudRule.getRuleName();
                System.out.println(transaction);
                break;
            }
        }

        return new FraudDetectionResult(fraud, ruleName);
    }

}
