package student_regina_svistunov.lesson_4.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.companyName();
        stockTest.currentPrice();
        stockTest.maxPrice();
        stockTest.minPrice();

    }

    public void companyName() {
        Stock stock = new Stock("test", 12);
        String name = stock.getCompanyName();

        if (name.equals("test")) {
            System.out.println("Test company name PASSED");
        } else {
            System.out.println("Test company name FAILED");
        }
    }

    public void currentPrice() {
        Stock stock = new Stock("test", 12);

        int currentPrice = stock.getCurrentPrice();
        int minPrice = stock.getMinPrice();
        int maxPrice = stock.getMaxPrice();

        if (currentPrice == minPrice && minPrice == maxPrice) {
            System.out.println("Test current price PASSED");
        } else {
            System.out.println("Test current price FAILED");
        }
    }

    public void maxPrice() {
        Stock stock = new Stock("test", 12);

        int currentPrice = stock.getCurrentPrice();
        int minPrice = stock.getMinPrice();
        int maxPrice = stock.getMaxPrice();

        if (currentPrice <= minPrice && maxPrice <= minPrice) {
            System.out.println("Test max price PASSED");
        } else {
            System.out.println("Test max price FAILED");
        }
    }

    public void minPrice() {
        Stock stock = new Stock("test", 12);

        int currentPrice = stock.getCurrentPrice();
        int minPrice = stock.getMinPrice();
        int maxPrice = stock.getMaxPrice();

        if (currentPrice >= minPrice && minPrice <= maxPrice) {
            System.out.println("Test min price PASSED");
        } else {
            System.out.println("Test min price FAILED");
        }

    }





}