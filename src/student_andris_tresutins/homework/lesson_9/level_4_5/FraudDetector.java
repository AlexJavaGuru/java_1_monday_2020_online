package student_andris_tresutins.homework.lesson_9.level_4_5;
import java.util.ArrayList;

class FraudDetector {

    public ArrayList<FraudRule> fraudRuleX;

    FraudDetector(){
        fraudRuleX = new ArrayList<>();
        fraudRuleX.add(new FraudRule1("Deny pokemon"));
        fraudRuleX.add(new FraudRule2("money"));
        fraudRuleX.add(new FraudRule3("deny Sydney"));
        fraudRuleX.add(new FraudRule4("Deny Jamaica"));
        fraudRuleX.add(new FraudRule5("Deny Germany at certain capacity"));

    }

    boolean isFraud(Transaction transaction){
        for (FraudRule ruleX : fraudRuleX) {
            if(ruleX.isFraud(transaction)){
                return true;
            }
        }
        return false;
    }

}
