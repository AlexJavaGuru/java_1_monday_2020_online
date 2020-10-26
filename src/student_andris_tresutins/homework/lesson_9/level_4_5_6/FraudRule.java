package student_andris_tresutins.homework.lesson_9.level_4_5_6;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public String getRuleName() { return ruleName; }

}