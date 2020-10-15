package student_andris_tresutins.homework.lesson_9.level_4;

public class FraudDetector  {


    boolean isFraud(Transaction t) {

        Trader trader = t.getTrader();
        return "Pokemon".equals(trader.getFullName());

        }

    }
