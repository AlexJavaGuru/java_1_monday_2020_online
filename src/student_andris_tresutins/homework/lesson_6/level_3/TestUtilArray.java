package student_andris_tresutins.homework.lesson_6.level_3;

 class TestUtilArray {
    public static void main(String[] args) {
        TestUtilArray test = new TestUtilArray();
        test.searchnumresult();
    }

    public void searchnumresult() {
        UtilArray victim = new UtilArray();
        int searchNumber = 54;

        Boolean actualResult = victim.numberSearch(searchNumber).equals("That number was found at index " + 1);
        Boolean expectedResult = true;

        check(expectedResult, actualResult, "Search number in array test");
     }

     public void check(Boolean expectedRes, boolean result, String testName) {

         if (expectedRes == result) {
             System.out.println(testName + " has passed");
         } else {
             System.out.println(testName + " failed!");
             System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
         }
     }
}
