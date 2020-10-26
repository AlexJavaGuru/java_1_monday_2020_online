package student_lilija_g.homework.lesson_6.level_6.task_24;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TicTacToeTest {
    public static void main(String[] args) {

        TicTacToe myTicTacToe = new TicTacToe();
        TicTacToeTest myTicTacToeTest = new TicTacToeTest();

        int[][] myField = myTicTacToe.createField();

        int sumValue = myTicTacToe.sumTwoDimensionalArrayNumbers(myField);

        System.out.println("Field sum: "+ sumValue);
        myTicTacToeTest.totalTest(-9,sumValue, "Initialization");

        myField[0][0] = 0;
        sumValue = myTicTacToe.sumTwoDimensionalArrayNumbers(myField);
        myTicTacToeTest.totalTest(-8,sumValue, "Not initialization");


    }

    void totalTest(int expectedValue, int actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
