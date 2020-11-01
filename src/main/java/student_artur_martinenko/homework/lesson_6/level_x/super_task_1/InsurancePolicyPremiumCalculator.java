package student_artur_martinenko.homework.lesson_6.level_x.super_task_1;

import teacher.annotations.CodeReview;

//Можно было больше тестов и проверок в методах, все упирается во время. Надеюсь программа выполнена корректно.
@CodeReview(approved = true)
class InsurancePolicyPremiumCalculator {

    public static void main(String[] args) {
        Policy policy = new Policy("Artur M");

        policy.addInsuredProperty(InsurObjProperty.Property.apartment, "Apartment1", 1000, 1);
        policy.addInsuredProperty(InsurObjProperty.Property.house, "House2", 2000, 1);

        policy.addAppliancesToProperty("Apartment1", "television1", 300, 1);
        policy.addAppliancesToProperty("Apartment1", "vacuum1", 50, 3);

        policy.addAppliancesToProperty("House2", "television2", 300, 1);
        policy.addAppliancesToProperty("House2", "vacuum2", 50, 3);

        policy.addApplianceRisk("Apartment1", "television1", "theft");
        policy.addApplianceRisk("Apartment1", "television1", "fire");
        policy.addApplianceRisk("House2", "television2", "fire");
        policy.addApplianceRisk("House2", "vacuum2", "theft");

//        policy.displayInsuredItems();
        calculate(policy);
    }

    public static void calculate(Policy policy) {
        double propertySum = policy.calculatePropertyPrice();
        double applianceSum = policy.calculateAppliancePrice();
        System.out.println(
                "Insurance price for Property equals " + propertySum + "\n" +
                        "Insurance price for Appliances equals " + applianceSum + "\n" +
                        "TOTAL insurance cost is " + (propertySum + applianceSum)
        );
    }


}
