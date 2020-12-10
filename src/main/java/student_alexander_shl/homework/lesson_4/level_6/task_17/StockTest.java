package student_alexander_shl.homework.lesson_4.level_6.task_17;

public class StockTest {
    public static void main(String[] args) {

        Stock stock = new Stock("GOOD", 10.00);

        double stockMaxPrice = stock.getMaxPrice();

        StockTest stockTest = new StockTest();

        stockTest.checkTest(10.00, stockMaxPrice, "Max Price");
        stock.getPriceInformation();

        // 10 -> 12 -> 5 -> 7 -> 99 -> 77
        stock.updatePrice(12);
        stock.getPriceInformation();

        stock.updatePrice(5);
        stock.getPriceInformation();

        stock.updatePrice(7);
        stock.getPriceInformation();

        stock.updatePrice(99);
        stock.getPriceInformation();

        stock.updatePrice(77);
        stock.getPriceInformation();

        stock.updatePrice(999.00);
        stockTest.checkTest(999.00, stock.getMaxPrice(), "Max Price");

        stock.updatePrice(1.00);
        stockTest.checkTest(999.00, stock.getMaxPrice(), "Max Price");

        stock.updatePrice(1000.00);
        stockTest.checkTest(1000.00, stock.getMaxPrice(), "Max Price");

        stock.updatePrice(8.00);
        stockTest.checkTest(1000.00, stock.getMaxPrice(), "Max Price");
    }

    void checkTest(double calculatedValue, double realValue, String testName) {
        if (calculatedValue == realValue) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("calculatedValue = " + calculatedValue);
            System.out.println("realValue = " + realValue);
        }
    }
}
