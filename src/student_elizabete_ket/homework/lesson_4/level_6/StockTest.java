package student_elizabete_ket.homework.lesson_4.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StockTest {

    public static void main(String[] args) {
        StockTest victim = new StockTest();
        victim.test1();
        victim.test2();
        victim.test3();
        victim.test4();
        victim.test5();
        victim.test6();
        victim.test7();
        victim.test8();
        victim.test9();
        victim.test10();

    }

    public void test1 () {
        Stock elvi = new Stock ("Elvi", 10);

        if (elvi.getMinStockPrice() == elvi.getCurrentStockPrice() && elvi.getMaxStockPrice() == elvi.getCurrentStockPrice()) {
            System.out.println("Test 1 has passed");
            System.out.println(elvi.getPriceInformation());
        } else {
            System.out.println("Test failed");
        }
    }

    public void test2 () {
        Stock elvi = new Stock ("Elvi", 10);

        elvi.updateStockPrice(12);

        if (elvi.getMaxStockPrice() == 12) {
            System.out.println("Test 2 has passed");
            System.out.println(elvi.getPriceInformation());
        } else {
            System.out.println("Test failed");
        }
    }

    public void test3 () {
        Stock elvi = new Stock ("Elvi", 10);

        elvi.updateStockPrice(12);
        elvi.updateStockPrice(5);

        if (elvi.getMaxStockPrice() == 12) {
            System.out.println("Test 3 has passed");
            System.out.println(elvi.getPriceInformation());
        } else {
            System.out.println("Test failed");
        }
    }

    public void test4 () {
        Stock elvi = new Stock("Elvi", 10);

        elvi.updateStockPrice(12);
        elvi.updateStockPrice(5);
        elvi.updateStockPrice(7);

        if (elvi.getMaxStockPrice() == 12) {
            System.out.println("Test 4 has passed");
            System.out.println(elvi.getPriceInformation());
        } else {
            System.out.println("Test failed");
        }
    }

    public void test5 () {
        Stock elvi = new Stock("Elvi", 10);

        elvi.updateStockPrice(12);
        elvi.updateStockPrice(5);
        elvi.updateStockPrice(7);
        elvi.updateStockPrice(99);


        if (elvi.getMaxStockPrice() == 99) {
            System.out.println("Test 5 has passed");
            System.out.println(elvi.getPriceInformation());
        } else {
            System.out.println("Test failed");
        }
    }

    public void test6 () {
        Stock elvi = new Stock("Elvi", 10);

        elvi.updateStockPrice(12);
        elvi.updateStockPrice(5);
        elvi.updateStockPrice(7);
        elvi.updateStockPrice(99);
        elvi.updateStockPrice(77);

        if (elvi.getMaxStockPrice() == 99) {
            System.out.println("Test 6 has passed");
            System.out.println(elvi.getPriceInformation());
        } else {
            System.out.println("Test failed");
        }
    }

    public void test7 () {
        Stock elvi = new Stock("Elvi", 10);

        elvi.updateStockPrice(999);


        if (elvi.getMaxStockPrice() == 999) {
            System.out.println("Test 7 has passed");
    } else {
            System.out.println("Test failed");
        }
    }

    public void test8 () {
        Stock elvi = new Stock("Elvi", 10);

        elvi.updateStockPrice(999);
        elvi.updateStockPrice(1);


        if (elvi.getMaxStockPrice() == 999) {
            System.out.println("Test 8 has passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void test9 () {
        Stock elvi = new Stock("Elvi", 10);

        elvi.updateStockPrice(999);
        elvi.updateStockPrice(1);
        elvi.updateStockPrice(1000);


        if (elvi.getMaxStockPrice() == 1000) {
            System.out.println("Test 9 has passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void test10 () {
        Stock elvi = new Stock("Elvi", 10);

        elvi.updateStockPrice(999);
        elvi.updateStockPrice(1);
        elvi.updateStockPrice(1000);
        elvi.updateStockPrice(8);


        if (elvi.getMaxStockPrice() == 1000) {
            System.out.println("Test 10 has passed");
        } else {
            System.out.println("Test failed");
        }
    }

}
