package student_dmitry_vasiliev.lesson_9.level_5;

import org.junit.Test;
import teacher.annotations.CodeReview;

import static org.junit.Assert.assertTrue;

@CodeReview(approved = true)
public class FraudRule2Test {

    @Test
    public void moreThanBillion() {
        FraudRule2 victim = new FraudRule2("Rule2");
        Trader trader = new Trader("Pokemo", "Tallinn", "Estonia");
        Transaction t = new Transaction(trader, 1000001);
        boolean result = victim.isFraud(t);
        assertTrue(result);
    }

}