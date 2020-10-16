package student_andris_tresutins.homework.lesson_9.level_4_5;

public class FraudRule1 extends FraudRule  {


    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {

        Trader trader = t.getTrader();
        return "Pokemon".equals(trader.getFullName());

        }

    }
