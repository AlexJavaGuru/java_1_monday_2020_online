package student_andris_tresutins.homework.lesson_6.level_5;

 class TickTackToeTest {
    public static void main(String[] args) {
        TickTackToeTest test = new TickTackToeTest();
        test.isWinPositionForHorizontalsTest();
        test.isWinPositionForHorizontalsTestTwo();
        test.isWinPositionForVerticalsTest();
        test.isWinPositionForVerticalsTestTwo();
        test.isWinPositionForDiagonalsTest();
        test.isWinPositionForDiagonalsTestTwo();
        test.isWinPositionTestTwo();
        test.isWinPositionTest();
        test.isDrawPositionTest();
        test.isDrawPositionTestTwo();

    }

    public void isWinPositionForHorizontalsTest(){
        TickTackToe victim = new TickTackToe();

        boolean result = victim.isWinPositionForHorizontals(victim.tickTackArray(),1);
        boolean expectedResult = true;

        check(expectedResult, result, "Test if player Two won the game horizontally");
    }

     public void isWinPositionForHorizontalsTestTwo(){
         TickTackToe victim = new TickTackToe();

         boolean result = victim.isWinPositionForHorizontals(victim.tickTackArray(),0);
         boolean expectedResult = false;

         check(expectedResult, result, "Test if player One lost the game horizontally");
     }

     public void isWinPositionForVerticalsTest(){
         TickTackToe victim = new TickTackToe();

         boolean result = victim.isWinPositionForVerticals(victim.tickTackArrayTwo(),0);
         boolean expectedResult = true;

         check(expectedResult, result, "Test if player One won the game vertically");
     }

     public void isWinPositionForVerticalsTestTwo(){
         TickTackToe victim = new TickTackToe();

         boolean result = victim.isWinPositionForVerticals(victim.tickTackArrayTwo(),1);
         boolean expectedResult = false;

         check(expectedResult, result, "Test if player Two lost the game vertically");
     }

     public void isWinPositionForDiagonalsTest(){
         TickTackToe victim = new TickTackToe();

         boolean result = victim.isWinPositionForDiagonals(victim.tickTackArrayThree(),1);
         boolean expectedResult = true;

         check(expectedResult, result, "Test if player Two won the game Diagonally");
     }

     public void isWinPositionForDiagonalsTestTwo(){
         TickTackToe victim = new TickTackToe();

         boolean result = victim.isWinPositionForDiagonals(victim.tickTackArrayThree(),0);
         boolean expectedResult = false;

         check(expectedResult, result, "Test if player One lost the game Diagonally");
     }

     public void isWinPositionTestTwo(){
         TickTackToe victim = new TickTackToe();

         boolean result = victim.isWinPosition(victim.tickTackArrayThree(),0);
         boolean expectedResult = false;

         check(expectedResult, result, "Test if player One lost the game Diagonally");
     }

     public void isWinPositionTest(){
         TickTackToe victim = new TickTackToe();

         boolean result = victim.isWinPosition(victim.tickTackArrayThree(),1);
         boolean expectedResult = true;

         check(expectedResult, result, "Test if player Two won the game Diagonally");
     }

     public void isDrawPositionTest(){
         TickTackToe victim = new TickTackToe();

         boolean result = victim.isDrawPosition(victim.tickTackArrayThree());
         boolean expectedResult = false;

         check(expectedResult, result, "Test if its not a draw");
     }

     public void isDrawPositionTestTwo(){
         TickTackToe victim = new TickTackToe();

         boolean result = victim.isDrawPosition(victim.tickTackArrayDraw());
         boolean expectedResult = true;

         check(expectedResult, result, "Test if it is a draw");
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
