package student_dmitry_vasiliev.lesson_9.level_5;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FraudRule4Test {

    @Test
    public void fromJamaica() {
        FraudRule4 victim = new FraudRule4("Rule4");
        Trader trader = new Trader("Pokemo", "Portmore", "Jamaica");
        Transaction t = new Transaction(trader, 100);
        boolean result = victim.isFraud(t);
        assertTrue(result);
    }

}