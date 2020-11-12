package student_dmitry_vasiliev.lesson_9.level_5;

import org.junit.Test;
import teacher.annotations.CodeReview;

import static org.junit.Assert.assertTrue;

@CodeReview(approved = true)
public class FraudRule3Test {


    @Test
    public void fromSidney() {
        FraudRule3 victim = new FraudRule3("Rule3");
        Trader trader = new Trader("Pokemo", "Sidney", "Australia");
        Transaction t = new Transaction(trader, 100);
        boolean result = victim.isFraud(t);
        assertTrue(result);//Equals(true, result);
    }

}