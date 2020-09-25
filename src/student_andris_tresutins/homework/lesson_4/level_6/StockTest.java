package student_andris_tresutins.homework.lesson_4.level_6;


import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class StockTest {
     public static void main(String[] args) {
         StockTest test = new StockTest();
         test.testName();
         test.testCurrent();
         test.testMax();
         test.testMin();
     }

     public void testName(){
         Stock victim = new Stock("Tesla", 12);
         String name = victim.getName();

         if (name.equals("Tesla")){
             System.out.println("Test Name Passed");
         }
         else {
             System.out.println("Test Name Failed");
         }
     }

     public void testCurrent() {
         Stock victim = new Stock("Tesla", 12);

         int current = victim.getCurentPrice();
         int min = victim.getMin();
         int max = victim.getMax();

         if (current == min && min == max) {
             System.out.println("Test Current Passed");
         } else {
             System.out.println("Test Current failed");
         }
     }

     public void testMax() {
         Stock victim = new Stock("Tesla", 12);

         victim.updatePrice(18);
         victim.updatePrice(9);
         victim.updatePrice(12);

         int current = victim.getCurentPrice();
         int min = victim.getMin();
         int max = victim.getMax();

         if (max > current && max > min && max == 18) {
             System.out.println("Test Max Passed");
         } else {
             System.out.println("Test Max failed");
         }


     }

     public void testMin() {
         Stock victim = new Stock("Tesla", 12);

         victim.updatePrice(18);
         victim.updatePrice(9);
         victim.updatePrice(12);

         int current = victim.getCurentPrice();
         int min = victim.getMin();
         int max = victim.getMax();

         if (min < current && min < max && min == 9) {
             System.out.println("Test Min Passed");
         } else {
             System.out.println("Test Min failed");
         }
     }
 }
