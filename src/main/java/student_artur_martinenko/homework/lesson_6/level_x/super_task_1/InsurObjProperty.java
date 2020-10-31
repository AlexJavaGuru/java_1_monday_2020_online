package student_artur_martinenko.homework.lesson_6.level_x.super_task_1;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
class InsurObjProperty extends InsurObj {
    private Property property;

    private List<String> riskList = new ArrayList<>();
    private List<InsurObjAppliances> insuredAppliances = new ArrayList<>();

    public InsurObjProperty(Property property, String itemName, double itemPrice, int itemQty) {
        super(itemName, itemPrice, itemQty);
        this.property = property;
    }

    public enum Property {
        apartment,
        house
    }

    public Property getProperty() {
        return property;
    }

    public List<InsurObjAppliances> getInsuredAppliances() {
        return insuredAppliances;
    }

    public void addAppliance(InsurObjAppliances appliance) {
        insuredAppliances.add(appliance);
    }

    public InsurObjAppliances findAppliance(String appliance) {
        for (InsurObjAppliances object : insuredAppliances) {
            if (object.getItemName().equalsIgnoreCase(appliance)) {
                return object;
            }
        }
        return null;
    }

    @Override
    boolean addRisk(String riskName) {
        return false;
    }

    @Override
    public String getItemName() {
        return super.getItemName();
    }

    @Override
    public double getItemPrice() {
        return super.getItemPrice();
    }

    @Override
    public int getItemQty() {
        return super.getItemQty();
    }

    @Override
    public double getRiskPrice() {
        return super.getRiskPrice();
    }
}
