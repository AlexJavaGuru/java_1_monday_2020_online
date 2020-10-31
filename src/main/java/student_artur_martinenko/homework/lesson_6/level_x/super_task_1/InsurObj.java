package student_artur_martinenko.homework.lesson_6.level_x.super_task_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class InsurObj {
    private String itemName;
    private double itemPrice;
    private int itemQty;

    abstract boolean addRisk(String riskName);

    public InsurObj(String itemName, double itemPrice, int itemQty) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQty() {
        return itemQty;
    }

    public double getRiskPrice() {
        return itemPrice * itemQty;
    }

}
