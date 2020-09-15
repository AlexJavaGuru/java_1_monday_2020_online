package teacher.lesson_7.lessoncode.services;

import teacher.lesson_7.lessoncode.domain.enums.InsuranceRisk;
import teacher.lesson_7.lessoncode.domain.InsuredObject;

import java.math.BigDecimal;

public class InsuranceObjectPremiumCalculator {

    private InsuranceSubObjectPremiumCalculator insuranceSubObjectPremiumCalculator =
            new InsuranceSubObjectPremiumCalculator();

    public BigDecimal calculateInsuredObject(InsuredObject insuredObject) {
        BigDecimal insuredObjectRiskPremium = calculateInsuredPremiumItself(insuredObject);

        BigDecimal subObjectPremium = insuranceSubObjectPremiumCalculator.calculateInsuranceSubObjectPremium(insuredObject);
        //calculate sub-objects for insured object

        //sum insured object premium + sub-object premium
        BigDecimal result = insuredObjectRiskPremium.add(subObjectPremium);
        return result;
    }

    private BigDecimal calculateInsuredPremiumItself(InsuredObject insuredObject) {
        BigDecimal insuredObjectRiskPremium = BigDecimal.ZERO;
        for (InsuranceRisk insuranceRisk : insuredObject.getInsuranceRisk()) {
            BigDecimal premium = calculateInsuranceObjectRiskPremium(insuredObject, insuranceRisk);
            insuredObjectRiskPremium = insuredObjectRiskPremium.add(premium);
        }
        return insuredObjectRiskPremium;
    }

    private BigDecimal calculateInsuranceObjectRiskPremium(InsuredObject insuredObject,
                                                           InsuranceRisk insuranceRisk) {
        BigDecimal coefficient = insuredObject.getRiskCoefficient(insuranceRisk);
        return insuredObject.getCadastralValue().multiply(coefficient);
    }
}
