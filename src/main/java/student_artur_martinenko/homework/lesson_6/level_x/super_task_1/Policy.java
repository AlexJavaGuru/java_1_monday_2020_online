package student_artur_martinenko.homework.lesson_6.level_x.super_task_1;

import teacher.annotations.CodeReview;

import java.util.ArrayList;

@CodeReview(approved = true)
class Policy {
    private String policyName;
    private ArrayList<InsurObjProperty> itemsInsured = new ArrayList<>();

    public Policy(String policyName) {
        this.policyName = policyName;
    }

    public double calculatePropertyPrice() {
        double propertySum = 0;
        for (InsurObjProperty property : itemsInsured) {
            propertySum += property.getItemPrice() * property.getItemQty();
        }
        return propertySum;
    }

    public double calculateAppliancePrice() {
        double applianceSum = 0;
        applianceSum += calculateApplianceRiskPrice(RiskTypes.RiskName.theft);
        applianceSum += calculateApplianceRiskPrice(RiskTypes.RiskName.fire);
        return applianceSum;
    }


    public double checkIf2000AndRisk(double number, RiskTypes.RiskName risk) {
        double numberToReturn = number;

        if (number < 2000 && risk == RiskTypes.RiskName.theft) {
            numberToReturn += numberToReturn * InsurObjAppliances.THEFT_COEFFICIENT_NORMAL;
        } else if (number >= 2000 && risk == RiskTypes.RiskName.theft) {
            numberToReturn += numberToReturn * InsurObjAppliances.THEFT_COEFFICIENT_HIGH;
        }

        if (number < 2000 && risk == RiskTypes.RiskName.fire) {
            numberToReturn += numberToReturn * InsurObjAppliances.FIRE_COEFFICIENT_NORMAL;
        } else if (number >= 2000 && risk == RiskTypes.RiskName.fire) {
            numberToReturn += numberToReturn * InsurObjAppliances.FIRE_COEFFICIENT_HIGH;
        }

        return numberToReturn;
    }

    public double calculateApplianceRiskPrice(RiskTypes.RiskName risk) {
        double applianceSum = 0;
        for (InsurObjProperty propertyy : itemsInsured) {
            for (InsurObjAppliances appliance : propertyy.getInsuredAppliances()) {
                ArrayList<String> tempRiskList = appliance.getRiskList();
                if (tempRiskList.contains(risk.toString())) {
                    applianceSum += appliance.getItemPrice() * appliance.getItemQty();
                }
            }
        }
        return checkIf2000AndRisk(applianceSum, risk);
    }

    public String getPolicyName() {
        return policyName;
    }


    public ArrayList<InsurObjProperty> getItemsInsured() {
        return new ArrayList<InsurObjProperty>(itemsInsured);
    }

    public void addInsuredProperty(InsurObjProperty.Property property, String itemName, double itemPrice, int itemQty) {
        InsurObjProperty tempProperty = new InsurObjProperty(property, itemName, itemPrice, itemQty);
        itemsInsured.add(tempProperty);
    }

    public boolean addAppliancesToProperty(String propertyName, String itemName, double itemPrice, int itemQty) {
        InsurObjProperty tempProperty = findProperty(propertyName);
        if (tempProperty != null) {
            tempProperty.addAppliance(new InsurObjAppliances(tempProperty.getProperty(), itemName, itemPrice, itemQty));
            return true;
        }
        return false;
    }

    public void addApplianceRisk(String propertyName, String applianceName, String riskType) {
        InsurObjProperty tempProperty = findProperty(propertyName);
        InsurObjAppliances tempAppliance = tempProperty.findAppliance(applianceName);

        tempAppliance.addRisk(riskType);
    }

    public InsurObjProperty findProperty(String propertyName) {
        for (InsurObjProperty property : itemsInsured) {
            if (property.getItemName().toLowerCase().equalsIgnoreCase(propertyName)) {
                return property;
            }
        }
        return null;
    }

    public void displayInsuredItems() {
        System.out.println("Policy '" + getPolicyName() + "' contains " + itemsInsured.size() + " insured properties.");
        for (InsurObjProperty property : itemsInsured) {
            System.out.println("\tProperty - " + property.getItemName());
            for (InsurObjAppliances appliance : property.getInsuredAppliances()) {
                System.out.println("\t\tAppliance - " + appliance.getItemName());
                for (String risk : appliance.getRiskList()) {
                    System.out.println("\t\t\t-> is insured for " + risk);
                }
            }
        }
    }


}
