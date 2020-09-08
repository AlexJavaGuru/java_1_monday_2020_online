package teacher.lesson_7.lessoncode.domain;

import teacher.lesson_7.lessoncode.domain.enums.InsuranceRisk;

import java.math.BigDecimal;

public class Flat extends InsuredObject {

    public Flat(BigDecimal cadastralValue) {
        super(cadastralValue);
    }

    @Override
    public BigDecimal getRiskCoefficient(InsuranceRisk insuranceRisk) {
        if (InsuranceRisk.FIRE.equals(insuranceRisk)) {
            return new BigDecimal("0.02");
        }
        throw new IllegalArgumentException("Insurance risk not supported! " + insuranceRisk);
    }
}
