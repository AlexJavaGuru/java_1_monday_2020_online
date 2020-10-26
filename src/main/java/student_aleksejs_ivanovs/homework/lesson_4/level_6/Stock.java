package student_aleksejs_ivanovs.homework.lesson_4.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Stock {

    public String companyName;
    public int currentPrice;
    public int minPrice;
    public int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
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

    public int getMaxCost() {
        return maxPrice;
    }

    public String getPriceInformation() {
        return ("Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
    }
}
