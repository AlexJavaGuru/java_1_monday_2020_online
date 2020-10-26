package student_lilija_g.homework.lesson_9.level_6_middle.task_30_task_33;


import teacher.annotations.CodeReview;

import java.util.ArrayList;

@CodeReview(approved = true)
class FraudDetector {

    public ArrayList<FraudRule> fraudRules;

    public FraudDetector() {
        fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1("Pokemon"));
        fraudRules.add(new FraudRule2("Amount > 1000000"));
        fraudRules.add(new FraudRule3("Sydney"));
        fraudRules.add(new FraudRule4("Jamaica"));
        fraudRules.add(new FraudRule5("Germany, Amount > 1000"));
    }

    public FraudDetectionResult isFraud(Transaction transaction) {
        boolean transactionIsFraud = false;
        String fraudName = null;
        for (FraudRule fraudrule : fraudRules)
            if (fraudrule.isFraud(transaction)) {
                transactionIsFraud = true;
                fraudName = fraudrule.getRuleName();
                System.out.println("Is fraud " + transaction);
                break;
            }
        return new FraudDetectionResult(transactionIsFraud, fraudName);
    }
}



