package teacher.lesson_7.lessoncode.tests;

import teacher.lesson_7.lessoncode.domain.*;
import teacher.lesson_7.lessoncode.domain.enums.InsuranceRisk;
import teacher.lesson_7.lessoncode.services.InsurancePolisyPremiumCalculator;

import java.math.BigDecimal;

//House = 100000 => 5000 + 125 = 5125
//        TV = 1500
//        PC = 500
//        Samsung = 500
//        FIRE/THEFT
//
//        House = 50000

public class PremiumCalculatorTest {

    public static void main(String[] args) {
        InsurancePolisyPremiumCalculator insurancePolisyPremiumCalculator = new InsurancePolisyPremiumCalculator();
        Policy policy = new Policy();
        InsuredObject house = new House(new BigDecimal("100000.00"));
        InsuredObject flat = new Flat(new BigDecimal("50000.00"));
        house.addRisk(InsuranceRisk.FIRE);
        flat.addRisk(InsuranceRisk.FIRE);

        SubInsuredObject tv = new SubInsuredObject("Samsung", new BigDecimal("1500"));
        tv.addRisk(InsuranceRisk.FIRE);
        tv.addRisk(InsuranceRisk.THEFT);

        SubInsuredObject pc = new SubInsuredObject("Alean Ware", new BigDecimal("500"));
        pc.addRisk(InsuranceRisk.FIRE);
        pc.addRisk(InsuranceRisk.THEFT);

        SubInsuredObject phone = new SubInsuredObject("Samsung S8", new BigDecimal("500"));
        phone.addRisk(InsuranceRisk.FIRE);
        phone.addRisk(InsuranceRisk.THEFT);
        house.addSubObjects(tv);
        house.addSubObjects(pc);
        house.addSubObjects(phone);

        policy.addInsuredObjects(house);
        policy.addInsuredObjects(flat);

        BigDecimal calculate = insurancePolisyPremiumCalculator.calculatePolicy(policy);
        System.out.println(calculate);

    }
}
