package student_dmitry_vasiliev.lesson_9.level_5;

import org.junit.Test;
import teacher.annotations.CodeReview;

import static org.junit.Assert.assertTrue;

@CodeReview(approved = true)
public class FraudRule1Test {

    @Test
    public void testIsPokemon() {
        FraudRule1 victim = new FraudRule1("Rule1");
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction t = new Transaction(trader, 100);
        boolean result = victim.isFraud(t);
        assertTrue(result);
    }

}