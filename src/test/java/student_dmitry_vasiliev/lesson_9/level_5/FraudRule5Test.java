package student_dmitry_vasiliev.lesson_9.level_5;

import org.junit.Test;
import teacher.annotations.CodeReview;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class FraudRule5Test {

    @Test
    public void germanyMore1000() {
        FraudRule5 victim = new FraudRule5("Rule5");
        Trader trader = new Trader("Pokemo", "Bremen", "Germany");
        Transaction t = new Transaction(trader, 1001);
        boolean result = victim.isFraud(t);
        assertTrue(result);
    }

}