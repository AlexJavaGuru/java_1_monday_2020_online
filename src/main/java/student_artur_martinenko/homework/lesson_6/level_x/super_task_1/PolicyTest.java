package student_artur_martinenko.homework.lesson_6.level_x.super_task_1;

import java.util.ArrayList;
import java.util.List;

class PolicyTest {

    public static void main(String[] args) {
        PolicyTest victim = new PolicyTest();

        victim.policyItemsInsuredFillingTest();
        victim.findPropertyPositiveTest();
        victim.findPropertyNegativeTest();
        victim.findAppliancePositiveTest();
        victim.findApplianceNegativeTest();
        victim.addAppliancesToPropertyPositiveTest();
        victim.addAppliancesToPropertyNegativeTest();
        victim.addRiskToApplianceTest();
        victim.calculateApplianceRiskAmountTest();
        victim.calculatePropertyPriceTest();
        victim.checkIf2000AndRiskUnderTheftTest();
        victim.checkIf2000AndRiskAboveTheftTest();
        victim.checkIf2000AndRiskUnderFireTest();
        victim.checkIf2000AndRiskAboveFireTest();
        victim.calculateAppliancePriceTest();

    }

    public void check(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
        }
    }

    public void policyItemsInsuredFillingTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 1000, 1);
        policy.addInsuredProperty(InsurObjProperty.Property.house, "House1", 2000, 1);
        boolean flag = !policy.getItemsInsured().isEmpty();
        check(flag, "policyItemsInsuredFillingTest");
    }

    public void findPropertyPositiveTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 1000, 1);
        policy.addInsuredProperty(InsurObjProperty.Property.house, "House1", 2000, 1);
        InsurObjProperty tempProperty = policy.findProperty("Apartment1");
        boolean flag = tempProperty.getItemName().equalsIgnoreCase("Apartment1");
        check(flag, "findPropertyPositiveTest");
    }

    public void findPropertyNegativeTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 1000, 1);
        policy.addInsuredProperty(InsurObjProperty.Property.house, "House1", 2000, 1);
        InsurObjProperty tempProperty = policy.findProperty("Apartment1");
        boolean flag = tempProperty.getItemName().equalsIgnoreCase("House1");
        check(!flag, "findPropertyNegativeTest");
    }

    public void findAppliancePositiveTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 1000, 1);
        policy.addAppliancesToProperty("Apartment1", "television1", 300, 1);
        InsurObjProperty tempProperty = policy.findProperty("Apartment1");
        InsurObjAppliances tempAppliance = tempProperty.findAppliance("television1");
        boolean flag = tempAppliance.getItemName().equalsIgnoreCase("television1");
        check(flag, "findAppliancePositiveTest");
    }

    public void findApplianceNegativeTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 1000, 1);
        policy.addAppliancesToProperty("Apartment1", "television1", 300, 1);
        InsurObjProperty tempProperty = policy.findProperty("Apartment1");
        InsurObjAppliances tempAppliance = tempProperty.findAppliance("television1");
        boolean flag = !tempAppliance.getItemName().equalsIgnoreCase("television2");
        check(flag, "findAppliancePositiveTest");
    }

    public void addAppliancesToPropertyPositiveTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 1000, 1);
        policy.addAppliancesToProperty("Apartment1", "television", 300, 1);
        boolean flag = false;
        List<InsurObjAppliances> tempArray = policy.findProperty("Apartment1").getInsuredAppliances();
        for (InsurObjAppliances o : tempArray) {
            if (o.getItemName().equalsIgnoreCase("television")) {
                flag = true;
            }
        }
        check(flag, "addAppliancesToPropertyPositiveTest");
    }

    public void addAppliancesToPropertyNegativeTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 1000, 1);
        policy.addAppliancesToProperty("Apartment1", "television", 300, 1);
        boolean flag = false;
        List<InsurObjAppliances> tempArray = policy.findProperty("Apartment1").getInsuredAppliances();
        for (InsurObjAppliances o : tempArray) {
            if (o.getItemName().equalsIgnoreCase("television1")) {
                flag = true;
            }
        }
        check(!flag, "addAppliancesToPropertyNegativeTest");
    }

    public void addRiskToApplianceTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 1000, 1);
        policy.addAppliancesToProperty("Apartment1", "television1", 300, 1);
        policy.addApplianceRisk("Apartment1", "television1", "theft");
        policy.addApplianceRisk("Apartment1", "television1", "fire");

        InsurObjProperty tempProperty = policy.findProperty("Apartment1");
        InsurObjAppliances tempAppliance = tempProperty.findAppliance("television1");
        ArrayList<String> tempArray = tempAppliance.getRiskList();

        boolean flag = false;
        if (tempArray.contains("theft") && tempArray.contains("fire")) {
            flag = true;
        }
        check(flag, "addRiskToApplianceTest");
    }

    public void calculateApplianceRiskAmountTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 2000, 1);
        policy.addInsuredProperty(InsurObjProperty.Property.house, "House2", 2000, 1);

        policy.addAppliancesToProperty("Apartment1", "television1", 300, 1);
        policy.addAppliancesToProperty("Apartment1", "vacuum1", 100, 3);

        policy.addAppliancesToProperty("House2", "television2", 300, 1);
        policy.addAppliancesToProperty("House2", "vacuum2", 100, 3);

        policy.addApplianceRisk("Apartment1", "television1", "theft");
        policy.addApplianceRisk("Apartment1", "television1", "fire");
        policy.addApplianceRisk("House2", "television2", "fire");
        policy.addApplianceRisk("House2", "vacuum2", "theft");

        double fireRiskAmount = policy.calculateApplianceRiskPrice(RiskTypes.RiskName.fire);
        double theftRiskAmount = policy.calculateApplianceRiskPrice(RiskTypes.RiskName.theft);
        boolean flagFire = fireRiskAmount == 600;
        boolean flagTheft = theftRiskAmount == 600;

        double applianceSum = 0;
        ArrayList<InsurObjProperty> tempItemsInsured = policy.getItemsInsured();
        for (InsurObjProperty property : tempItemsInsured) {
            for (InsurObjAppliances appliance : property.getInsuredAppliances()) {
                applianceSum += appliance.getItemPrice() * appliance.getItemQty();
            }
        }
        boolean total = applianceSum == (fireRiskAmount + theftRiskAmount);

        check(flagFire && flagTheft && total, "calculateApplianceRiskAmountTest");
    }

    public void calculatePropertyPriceTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 2000, 3);
        policy.addInsuredProperty(InsurObjProperty.Property.house, "House2", 2000, 2);
        double propertySum = policy.calculatePropertyPrice();
        boolean flag = propertySum == 10000;
        check(flag, "calculatePropertyPriceTest");
    }

    public void checkIf2000AndRiskUnderTheftTest() {
        Policy policy = new Policy("Artur M");
        double returnNumber = policy.checkIf2000AndRisk(1000, RiskTypes.RiskName.theft);
        boolean flag = returnNumber == 1010;
        check(flag, "checkIf2000AndRiskUnderTheftTest");
    }

    public void checkIf2000AndRiskAboveTheftTest() {
        Policy policy = new Policy("Artur M");
        double returnNumber = policy.checkIf2000AndRisk(2000, RiskTypes.RiskName.theft);
        boolean flag = returnNumber == 2040;
        check(flag, "checkIf2000AndRiskAboveTheftTest");
    }

    public void checkIf2000AndRiskUnderFireTest() {
        Policy policy = new Policy("Artur M");
        double returnNumber = policy.checkIf2000AndRisk(1000, RiskTypes.RiskName.fire);
        boolean flag = returnNumber == 1030;
        check(flag, "checkIf2000AndRiskUnderFireTest");
    }

    public void checkIf2000AndRiskAboveFireTest() {
        Policy policy = new Policy("Artur M");
        double returnNumber = policy.checkIf2000AndRisk(2000, RiskTypes.RiskName.fire);
        boolean flag = returnNumber == 2080;
        check(flag, "checkIf2000AndRiskAboveFireTest");
    }


    public void calculateAppliancePriceTest() {
        Policy policy = new Policy("Artur M");
        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 2000, 2);
        policy.addInsuredProperty(InsurObjProperty.Property.house, "House2", 2000, 2);

        policy.addAppliancesToProperty("Apartment1", "television1", 300, 5);
        policy.addApplianceRisk("Apartment1", "television1", "theft");
        policy.addApplianceRisk("Apartment1", "television1", "fire");

        policy.addAppliancesToProperty("Apartment1", "vacuum1", 100, 3);

        policy.addAppliancesToProperty("House2", "television2", 300, 5);
        policy.addApplianceRisk("House2", "television2", "theft");
        policy.addApplianceRisk("House2", "television2", "fire");

        policy.addAppliancesToProperty("House2", "vacuum2", 100, 3);
        policy.addApplianceRisk("House2", "vacuum2", "theft");

        double appliancePrice = policy.calculateAppliancePrice();
        boolean flag = appliancePrice == 6486;
        check(flag, "calculateAppliancePriceTest");
    }


}
