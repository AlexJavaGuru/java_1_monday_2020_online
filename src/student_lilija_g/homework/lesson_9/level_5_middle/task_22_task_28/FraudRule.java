package student_lilija_g.homework.lesson_9.level_5_middle.task_22_task_28;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction transaction);

}
