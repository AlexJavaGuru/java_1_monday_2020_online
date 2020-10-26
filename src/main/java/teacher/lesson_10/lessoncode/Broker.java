package teacher.lesson_10.lessoncode;

import java.math.BigDecimal;

public class Broker {

    private InsurancePremiumCalculator calculator;

    public Broker(InsurancePremiumCalculator calculator) {
        this.calculator = calculator;
    }

    public void callToTheCustomerAndCalculatePremiumForHim() {
        Policy policy = new Policy(); // UI
        BigDecimal premium = calculator.calculatePremium(policy);
        System.out.println(premium);
    }

}
