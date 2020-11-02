package student_dmitry_vasiliev.lesson_9.level_5;

// - Task_29
// Создайте в классе FraudDetector конструктор, который принимает
//массив или список объектов типа FraudRule. Через этот конструктор
//в класс FraudDetector будут подаваться все автоматические правила
//определения мошенничества, которые реализованы отдельными классами.

import teacher.annotations.CodeReview;

import java.util.ArrayList;

@CodeReview(approved = true)
class FraudDetector {

    public ArrayList<FraudRule> fraudRules;

    public FraudDetector() {
        fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1("Pokemon"));
        fraudRules.add(new FraudRule2("More1000000"));
        fraudRules.add(new FraudRule3("Rul3"));
        fraudRules.add(new FraudRule4("Rul4"));
        fraudRules.add(new FraudRule5("Rul5"));
    }

    public FraudDetector(Transaction transaction) {
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
        System.out.println("The transaction is safe!");
    }

}
