package student_regina_svistunov.lesson_9.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();

        if ("Pokemon".equals(trader.getFullName())) {
            return true;
        } else if (t.getAmount() > 1000000) {
            return true;
        } else if ("Sidney".equals(trader.getCity())) {
            return true;
        } else if ("Jamaica".equals(trader.getCountry())) {
            return true;
        } else return "Germany".equals(trader.getCountry()) && t.getAmount() < 1000;
    }
}
