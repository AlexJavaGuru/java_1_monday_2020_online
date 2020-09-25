package student_elizabete_ket.homework.lesson_4.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Stock {

    private String companyName;
    private double currentStockPrice;
    private double minStockPrice;
    private double maxStockPrice;

    public Stock(String companyName, double currentStockPrice) {
        this.companyName = companyName;
        this.currentStockPrice = currentStockPrice;
        this.minStockPrice = currentStockPrice;
        this.maxStockPrice = currentStockPrice;
    }
    public void updateStockPrice (double newStockPrice) {
        currentStockPrice = newStockPrice;
        if (newStockPrice > maxStockPrice) {
            maxStockPrice = newStockPrice;
        } else if (newStockPrice < minStockPrice) {
            minStockPrice = newStockPrice;
        }
    }

    public String getCompanyName () {
        return companyName;
    }

    public double getCurrentStockPrice () {
        return currentStockPrice;
    }

    public double getMinStockPrice () {
        return minStockPrice;
    }

    public double getMaxStockPrice () {
        return maxStockPrice;
    }

    public String getPriceInformation () {
        return ("Company name = " + companyName + "," + " Current Price = " + currentStockPrice + ","+ " Min price = " + minStockPrice + "," + " Max Price = " + maxStockPrice);
    }
}



/*
*   Elvi
*   current price = 10
*   min price = 10
*   max price = 10
*
*   Elvi
*   current price = newPrice = 20
*   min price = 10
*   mac price = 20
*
*
*   Elvi
*   current prive = newPrice = 15
*   min price = 10
*   max price = 20
*
*
* */

//    }
//
//    public void getPriceInformation() {
//        System.out.println("Stock name: " + companyName);
//        System.out.println("Current price: "чё + currentStockPrice);
//    }
//
//    public double increaseStockPrice (double addStockPrice) {
//        this.currentStockPrice = this.currentStockPrice + addStockPrice;
//        return this.currentStockPrice;
//    }
//
//    public double decreaseStockPrice (double removeStockPrice) {
//        this.currentStockPrice = this.currentStockPrice - removeStockPrice;
//        return this.currentStockPrice;
//    }}
