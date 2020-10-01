package student_andris_tresutins.homework.lesson_5.level_6;

public class Task_37_39_Test {

    public static void main(String[] args) {
        Task_37_39_Test test = new Task_37_39_Test();

        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }


    public void shouldFindMaxNumber() {
        Task_36 victim = new Task_36();

        int actualresult = victim.findMaxNumber(victim.staticArray());
        int expectedResult = 99;

        check(expectedResult, actualresult, "should find max number");

    }

    public void shouldFindMinNumber() {
        Task_38 victim = new Task_38();

        int actualresult = victim.findMinNumber();
        int expectedResult = 15;

        check(expectedResult, actualresult, "should find min number");

    }

    public void check(int expectedRes, int result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }
}
