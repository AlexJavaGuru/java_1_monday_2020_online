package student_andris_tresutins.homework.lesson_6.level_1;

 class TestTest {

     public static void main(String[] args) {

         TestTest test = new TestTest();

         test.testisEven();
         test.weekOfTheDayDoctorOne();
         test.weekOfTheDayDoctorTwo();
         test.weekOfTheDayDoctorThree();
         test.weekOfTheDayDoctorfour();
         test.weekOfTheDayDoctorfive();
         test.weekOfTheDayDoctorsix();
         test.weekOfTheDayDoctorseven();

     }

     public void testisEven(){

         int firstInt = 20;
         Calc victim = new Calc();

         boolean result5 = victim.isEven(firstInt);
         boolean expectedres = true;

         check(expectedres, result5, "Even test");


     }

     public void weekOfTheDayDoctorOne(){

         Task_2 victim = new Task_2();

         String actualresult = victim.detectDayName(1);

         String expectedresult = "Monday";

         check(expectedresult, actualresult, "Week Of The day : Monday");

     }

     public void weekOfTheDayDoctorTwo(){

         Task_2 victim = new Task_2();

         String actualresult = victim.detectDayName(2);

         String expectedresult = "Tuesday";

         check(expectedresult, actualresult, "Week Of The day : Tuesday");

     }

     public void weekOfTheDayDoctorThree(){

         Task_2 victim = new Task_2();

         String actualresult = victim.detectDayName(3);

         String expectedresult = "Wednesday";

         check(expectedresult, actualresult, "Week Of The day : Wednesday");

     }

     public void weekOfTheDayDoctorfour(){

         Task_2 victim = new Task_2();

         String actualresult = victim.detectDayName(4);

         String expectedresult = "Thursday";

         check(expectedresult, actualresult, "Week Of The day : Thursday");

     }

     public void weekOfTheDayDoctorsix(){

         Task_2 victim = new Task_2();

         String actualresult = victim.detectDayName(5);

         String expectedresult = "Friday";

         check(expectedresult, actualresult, "Week Of The day : Friday");

     }

     public void weekOfTheDayDoctorseven(){

         Task_2 victim = new Task_2();

         String actualresult = victim.detectDayName(6);

         String expectedresult = "Saturday";

         check(expectedresult, actualresult, "Week Of The day : Saturday");

     }

     public void weekOfTheDayDoctorfive(){

         Task_2 victim = new Task_2();

         String actualresult = victim.detectDayName(7);

         String expectedresult = "Sunday";

         check(expectedresult, actualresult, "Week Of The day : Sunday");

     }

     public void check(String expectedRes, String result, String testName) {
         if (expectedRes == result) {
             System.out.println(testName + " has passed");
         } else {
             System.out.println(testName + " failed!");
             System.out.println("Expected result was " + expectedRes + " but actual result " + result);
         }
     }


     public void check(boolean expectedRes, boolean result, String testName) {
         if (expectedRes == result) {
             System.out.println(testName + " has passed");
         } else {
             System.out.println(testName + " failed!");
             System.out.println("Expected result was " + expectedRes + " but actual result " + result);
         }
     }

}
