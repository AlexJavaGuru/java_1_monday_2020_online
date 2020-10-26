package student_artur_martinenko.homework.lesson_6.level_x.super_task_1;

import java.util.ArrayList;

class InsurObjAppliances extends InsurObjProperty implements RiskTypes {
    static final double FIRE_COEFFICIENT_HIGH = 0.04;
    static final double FIRE_COEFFICIENT_NORMAL = 0.03;
    static final double THEFT_COEFFICIENT_HIGH = 0.02;
    static final double THEFT_COEFFICIENT_NORMAL = 0.01;

    private ArrayList<String> riskList = new ArrayList<>();

    public InsurObjAppliances(Property property, String itemName, double itemPrice, int itemQty) {
        super(property, itemName, itemPrice, itemQty);
    }

    @Override
    public boolean addRisk(String riskName) {
        if (!riskList.contains(riskName.toLowerCase())) {
            for (RiskName risk : RiskName.values()) {
                if (risk.toString().equalsIgnoreCase(riskName)) {
                    riskList.add(risk.toString());
                    return true;
                }
            }
        }
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

    public ArrayList<String> getRiskList() {
        return riskList;
    }

}
