package student_lilija_g.homework.lesson_4.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Отлично. Спасибо")

class StockTest {

    public static void main(String[] args) {

        Stock stock = new Stock("GOOG", 10.00);

        double stockMaxPrice = stock.getMaxPrice();

        StockTest stockTest = new StockTest();

        stockTest.totalTest(10.00, stockMaxPrice, "Max Price");
        System.out.println(stock.getPriceInformation());

        // 10 -> 12 -> 5 -> 7 -> 99 -> 77
        stock.updatePrice(12);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(5);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(7);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(99);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(77);
        System.out.println(stock.getPriceInformation());

        stock.updatePrice(999.00);
        stockTest.totalTest(999.00, stock.getMaxPrice(), "Max Price");

        stock.updatePrice(1.00);
        stockTest.totalTest(999.00, stock.getMaxPrice(), "Max Price");

        stock.updatePrice(1000.00);
        stockTest.totalTest(1000.00, stock.getMaxPrice(), "Max Price");

        stock.updatePrice(8.00);
        stockTest.totalTest(1000.00, stock.getMaxPrice(), "Max Price");
    }

    void totalTest(double expectedValue, double actualValue, String testName) {
        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}


