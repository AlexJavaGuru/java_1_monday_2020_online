package teacher.lesson_7.lessoncode.services;

import teacher.lesson_7.lessoncode.domain.InsuredObject;
import teacher.lesson_7.lessoncode.domain.Policy;

import java.math.BigDecimal;
import java.util.List;

public class InsurancePolisyPremiumCalculator {

    private InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator
            = new InsuranceObjectPremiumCalculator();


    public BigDecimal calculatePolicy(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        List<InsuredObject> insuredObjects = policy.getInsuredObjects();
        for (InsuredObject insuredObject : insuredObjects) {
            BigDecimal insuredObjectPremium = insuranceObjectPremiumCalculator.calculateInsuredObject(insuredObject);
            premium = premium.add(insuredObjectPremium);
        }

        return premium;
    }
}
