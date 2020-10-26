package student_aleksejs_ivanovs.homework.lesson_4.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StockTest {

    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.testOne();
        test.testTwo();
        test.testThree();
        test.testFour();
    }

    public void testOne() {
        Stock micro = new Stock("Micro", 39);

        micro.updatePrice(50);
        micro.updatePrice(100);
        micro.updatePrice(20);

        if (micro.getMaxCost() == 100) {
            System.out.println("Okay");
        } else {
            System.out.println("Not okay");
        }
    }

    public void testTwo() {
        Stock micro = new Stock("Micro", 50);

        micro.updatePrice(10);
        micro.updatePrice(30);
        micro.updatePrice(300);

        if (micro.getMinPrice() == 10) {
            System.out.println("Okay");
        } else {
            System.out.println("Not okay");
        }
    }

    public void testThree() {
        Stock micro = new Stock("Micro", 100);

        micro.updatePrice(130);
        micro.updatePrice(70);
        micro.updatePrice(500);

        if (micro.getCurrentPrice() == 500) {
            System.out.println("Okay");
        } else {
            System.out.println("Not okay");
        }
    }

    public void testFour() {
        Stock micro = new Stock("Micro", 100);

        if (micro.getCompanyName().equals(micro.companyName)) {
            System.out.println("Okay");
        } else {
            System.out.println("Not okay");
        }
    }
}
