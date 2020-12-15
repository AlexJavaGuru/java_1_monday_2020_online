package student_alexander_shl.homework.lesson_7.level_6_middle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void init() {
        creditCard = new CreditCard("1111 11111 11111 11111", 2345);
    }

    @Test
    public void checkCreditCard() {

        Assert.assertEquals(0, creditCard.getBalance(), 0);

        creditCard.changeCreditLimit(2000);
        Assert.assertEquals(2000, creditCard.getCreditLimit(), 0);

        creditCard.deposit(2345, 1000);
        Assert.assertEquals(1000, creditCard.getBalance(), 0);

        creditCard.withdraw(2345, 3000);
        Assert.assertEquals(0, creditCard.getBalance(), 0);
        Assert.assertEquals(2000, creditCard.getCreditLimit(), 0);
        Assert.assertEquals(2000, creditCard.getLoanDebt(), 0);

        creditCard.deposit(2345, 8000);
        Assert.assertEquals(6000, creditCard.getBalance(), 0);
        Assert.assertEquals(0, creditCard.getLoanDebt(), 0);

        creditCard.deposit(2222, 8000);
        Assert.assertEquals(6000, creditCard.getBalance(), 0);
    }
}