package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

class FraudRule4 extends FraudRule{   // Task_27

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }

}
