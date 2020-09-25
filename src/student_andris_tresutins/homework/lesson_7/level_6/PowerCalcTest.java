package student_andris_tresutins.homework.lesson_7.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class PowerCalcTest {
    public static void main(String[] args) {
        PowerCalcTest test = new PowerCalcTest();
        test.test();
    }

    public void test(){
        Task_10 victim = new Task_10();

        double actualres = victim.raiseNumbertopower(6,3);
        double expectedres = 216.0;

        check(expectedres,actualres, "test Raise num To Power");

    }



    public void check(double expectedRes, double result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }

}


