package teacher.lesson_7.lessoncode.services;

import teacher.lesson_7.lessoncode.domain.enums.InsuranceRisk;
import teacher.lesson_7.lessoncode.domain.InsuredObject;
import teacher.lesson_7.lessoncode.domain.SubInsuredObject;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class InsuranceSubObjectPremiumCalculator {

    public static final String PRICE_BORDER = "2000";

    public static final String STANDART_FIRE_COEF = "0.03";
    public static final String OVERPRICED_FIRE_COEF = "0.04";

    public static final String STANDART_THEFT_COEF = "0.02";
    public static final String OVERPRICED_THEFT_COEF = "0.01";

    public BigDecimal calculateInsuranceSubObjectPremium(InsuredObject insuredObject) {
        Set<InsuranceRisk> subObjectRisks = identifyAllRisksForSubObjects(insuredObject);
        BigDecimal subInsuranceObjectRiskPremium = BigDecimal.ZERO;
        for (InsuranceRisk subObjectRisk : subObjectRisks) {
            //calculate price for risk
            BigDecimal subObjectPricePerRisk = calculatePricePerRisk(subObjectRisk, insuredObject);
            //get coef according to price
            BigDecimal coefficient = getRiskCoefficientForSubInsuredObject(subObjectRisk, subObjectPricePerRisk);
            subInsuranceObjectRiskPremium = subInsuranceObjectRiskPremium.add(subObjectPricePerRisk.multiply(coefficient));
        }
        return subInsuranceObjectRiskPremium;
    }


    private BigDecimal calculatePricePerRisk(InsuranceRisk subObjectRisk, InsuredObject insuredObject) {
        BigDecimal subObjectPricePerRisk = BigDecimal.ZERO;
        for (SubInsuredObject subInsuredObject : insuredObject.getSubInsuredObjects()) {
            if (subInsuredObject.getInsuranceRisks().contains(subObjectRisk)) {
                subObjectPricePerRisk = subObjectPricePerRisk.add(subInsuredObject.getPrice());
            }
        }
        return subObjectPricePerRisk;
    }

    private Set<InsuranceRisk> identifyAllRisksForSubObjects(InsuredObject insuredObject) {
        Set<InsuranceRisk> subObjectsRisks = new HashSet<>();
        for (SubInsuredObject subInsuredObject : insuredObject.getSubInsuredObjects()) {
            subObjectsRisks.addAll(subInsuredObject.getInsuranceRisks());
        }
        return subObjectsRisks;
    }

    private BigDecimal getRiskCoefficientForSubInsuredObject(InsuranceRisk subObjectRisk,
                                                             BigDecimal sum) {
        if (InsuranceRisk.FIRE == subObjectRisk) {
            if (sum.compareTo(new BigDecimal(PRICE_BORDER)) < 0) {
                return new BigDecimal(STANDART_FIRE_COEF);
            } else {
                return new BigDecimal(OVERPRICED_FIRE_COEF);
            }
        }
        if (InsuranceRisk.THEFT == subObjectRisk) {
            if (sum.compareTo(new BigDecimal(PRICE_BORDER)) < 0) {
                return new BigDecimal(STANDART_THEFT_COEF);
            } else {
                return new BigDecimal(OVERPRICED_THEFT_COEF);
            }
        }
        throw new IllegalArgumentException("Insurance risk not supported " + subObjectRisk);
    }
}
