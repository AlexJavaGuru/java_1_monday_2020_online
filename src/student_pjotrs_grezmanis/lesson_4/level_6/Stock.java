package student_pjotrs_grezmanis.lesson_4.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Stock {
    private String nameCompany;
    private int currentPrice;
    private int minimumPrice;
    private int maximumPrice;


    public Stock(String nameCompany, int currentPrice, int maximumPrice, int minimumPrice) {
        this.nameCompany = nameCompany;
        this.currentPrice = currentPrice;
        this.minimumPrice = minimumPrice;
        this.maximumPrice = maximumPrice;


    }

    void updatePrice(int newPrice) {
        if (newPrice > maximumPrice) {
            maximumPrice = newPrice;
        }
        if (newPrice < minimumPrice) {
            minimumPrice = newPrice;

        }
        currentPrice = newPrice;
    }

    public String getPriceInformation() {
        return ("Company = " + nameCompany + ", Current price = " + currentPrice + ", Minimum price = " + minimumPrice + ", Maximum price = " + maximumPrice);

    }

}
