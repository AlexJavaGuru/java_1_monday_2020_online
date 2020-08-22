package student_artur_martinenko.homework.lesson_4.level_6;

//Ну не хватает мне check методов )))
class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.negativePriceTest();
        stockTest.defaultPriceTest();
        stockTest.updatePriceTest();
        stockTest.updateMaxPriceTest();

    }

    public void negativePriceTest(){
        Stock temp = new Stock("test", -1);
        double currPrice = temp.getCurrPrice();
        double minPrice = temp.getMinPrice();
        double maxPrice = temp.getMaxPrice();
        if(currPrice == 0 && minPrice == 0 && maxPrice == 0){
            System.out.println("Negative Price Test - OK");
        }else {
            System.out.println("Negative Price Test - FAIL");
        }
    }

    public void defaultPriceTest(){
        Stock temp = new Stock("test", 10);
        double currPrice = temp.getCurrPrice();
        double minPrice = temp.getMinPrice();
        double maxPrice = temp.getMaxPrice();
        if(currPrice == 10 && minPrice == 10 && maxPrice == 10){
            System.out.println("Default Price Test - OK");
        }else {
            System.out.println("Default Price Test - FAIL");
        }
    }

    public void updatePriceTest(){
        Stock temp = new Stock("test", 10);
        temp.updatePrice(12);
        temp.updatePrice(5);
        temp.updatePrice(7);
        temp.updatePrice(99);
        temp.updatePrice(77);
        double currPrice = temp.getCurrPrice();
        double minPrice = temp.getMinPrice();
        double maxPrice = temp.getMaxPrice();
        if(currPrice == 77 && minPrice == 5 && maxPrice == 99){
            System.out.println("Update Price Test - OK");
        }else {
            System.out.println("Update Price Test - FAIL");
        }
    }

    public void updateMaxPriceTest(){
        Stock temp = new Stock("test", 999);
        temp.updatePrice(1);
        temp.updatePrice(2);
        temp.updatePrice(1000);
        temp.updatePrice(8);
        double currPrice = temp.getCurrPrice();
        double minPrice = temp.getMinPrice();
        double maxPrice = temp.getMaxPrice();
        if(currPrice == 8 && minPrice == 1 && maxPrice == 1000){
            System.out.println("Update Max Price Test - OK");
        }else {
            System.out.println("Update Max Price Test - FAIL");
        }
    }

}
