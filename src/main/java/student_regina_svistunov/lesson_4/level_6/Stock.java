package student_regina_svistunov.lesson_4.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Stock {

    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice >maxPrice) {
            maxPrice = newPrice;
        }
        else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public String getPriceInformation() {
        return ("Company = " + companyName + ", Current price = " + currentPrice + ", Min price = " + minPrice + ", Max price = " + maxPrice);
    }
}
