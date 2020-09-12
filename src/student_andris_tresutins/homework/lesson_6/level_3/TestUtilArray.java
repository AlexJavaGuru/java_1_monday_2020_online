package student_andris_tresutins.homework.lesson_6.level_3;
import java.util.Arrays;

 class TestUtilArray {
    public static void main(String[] args) {
        TestUtilArray test = new TestUtilArray();
        test.searchnumresult();
        test.searchnummultipletest();
        test.replaceNumberTest();
        test.replaceAllNumbersTest();
        test.reverseArray();
    }

    public void searchnumresult() {
        UtilArray victim = new UtilArray();
        int searchNumber = 54;

        Boolean actualResult = victim.numberSearch(searchNumber).equals("That number was found at index " + 1);
        Boolean expectedResult = true;

        check(expectedResult, actualResult, "Search number in array test");
     }

     public void searchnummultipletest(){
         UtilArray victim = new UtilArray();
         int searchNumber = 54;

         int actualresult = victim.numberSearchMultiple(searchNumber);
         int expectedresult = 3;

         check(expectedresult, actualresult, "Multiple of the same value in array search test");
     }

     public void replaceNumberTest(){
         UtilArray victim = new UtilArray();
         int numbertoreplace = 7;
         int newNumber = 13;

         int actualresult = victim.replaceNumber(numbertoreplace, newNumber);
         int expectedresult = 13;

         check(expectedresult,actualresult, "Replace Number in Array test");

     }

     public void replaceAllNumbersTest(){
         UtilArray victim = new UtilArray();
         int numberstoreplace = 54;
         int newNumber = 13;

         boolean actualresult = victim.replaceAllNumbers(numberstoreplace, newNumber).equals("[12, 13, 13, 13, 458]");
         boolean expectedresult = true;

         check(expectedresult,actualresult, "Replace All specific Numbers in Array test");

     }

     public void reverseArray(){
         UtilArray victim = new UtilArray();

         boolean actualresult = victim.reverseArray().equals("[458, 14, 54, 13, 12]");
         boolean expectedresult = true;

         check(expectedresult, actualresult, "Reverse Array test");


     }



     public void check(String expectedRes, String result, String testName) {

         if (expectedRes == result) {
             System.out.println(testName + " has passed");
         } else {
             System.out.println(testName + " failed!");
             System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
         }
     }

     public void check(int expectedRes, int result, String testName) {

         if (expectedRes == result) {
             System.out.println(testName + " has passed");
         } else {
             System.out.println(testName + " failed!");
             System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
         }
     }

     public void check(boolean expectedRes, boolean result, String testName) {

         if (expectedRes == result) {
             System.out.println(testName + " has passed");
         } else {
             System.out.println(testName + " failed!");
             System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
         }
     }
}
