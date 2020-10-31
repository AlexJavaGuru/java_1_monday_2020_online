package student_artur_martinenko.homework.lesson_9.level_6_middle.task_30_33;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
/*
Продолжаем работу над системой автоматического обнаружения мошенничества.

Поменяйте тип возвращаемого значения у метода FraudDetector.isFraud(Transaction t)
c boolean на FraudDetectionResult и внесите нужные изменения в код программы и тесты.

Теперь при срабатывании одного из правил определения мошенничества, вы можете
у самого правила узнать его название. Для этого достаточто будет вызвать метод
getRuleName() у объекта FraudRule. Полученное таким образом название правила
вы вернёте в качестве результата в объекте FraudDetectionResult.
 */

@CodeReview(approved = true)
class FraudDetector {

    public ArrayList<FraudRule> fraudRules;

    public FraudDetector() {
        fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1());
        fraudRules.add(new FraudRule2());
        fraudRules.add(new FraudRule3());
        fraudRules.add(new FraudRule4());
        fraudRules.add(new FraudRule5());
    }

    public FraudDetectionResult isFraud(Transaction transaction) {
        String fraudName = null;
        boolean isFraud = false;

        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                isFraud = true;
                fraudName = fraudRule.getRuleName();
                System.out.println(transaction);
                break;
            }
        }
        return new FraudDetectionResult(isFraud, fraudName);
    }


}

