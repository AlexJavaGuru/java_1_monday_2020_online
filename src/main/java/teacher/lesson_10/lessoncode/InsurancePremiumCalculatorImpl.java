package teacher.lesson_10.lessoncode;

import java.math.BigDecimal;

public class InsurancePremiumCalculatorImpl implements InsurancePremiumCalculator {

    @Override
    public BigDecimal calculatePremium(Policy policy) {
        return new BigDecimal("100.0");
    }

}
