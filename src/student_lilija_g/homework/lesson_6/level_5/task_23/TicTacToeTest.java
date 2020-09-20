package student_lilija_g.homework.lesson_6.level_5.task_23;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToe myTicTacToe = new TicTacToe();
        TicTacToeTest myTicTacToeTest = new TicTacToeTest();

        int[][] myField = myTicTacToe.createArray(3);
        myTicTacToe.fieldInitialization(myField);

        myTicTacToeTest.totalBooleanTest(true,myTicTacToe.isDrawPosition(myField), "Field initialized");

        myField[0][0] = 1;
        myField[0][1] = 0;
        myField[0][2] = 1;

        myField[1][0] = 1;
        myField[1][1] = 1;
        myField[1][2] = 0;

        myField[2][0] = 0;
        myField[2][1] = 1;
        myField[2][2] = 0;

        myTicTacToeTest.totalBooleanTest(false,myTicTacToe.isDrawPosition(myField), "Is -1"); // Есть ли еще пустые клетки

        if (myTicTacToe.isWin(myField, 0)) {
            if (myTicTacToe.isWin(myField, 1)) {
                if (!myTicTacToe.isDrawPosition(myField)) {
                    System.out.print("Result is draw...");
                }
            }
        }
    }


    void totalBooleanTest(Boolean expectedValue, Boolean actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
