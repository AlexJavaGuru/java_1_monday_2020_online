package student_lilija_g.homework.lesson_6.level_5.task_21;

public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToe myTicTacToe = new TicTacToe();
        TicTacToeTest myTicTacToeTest = new TicTacToeTest();

        int[][] myField = myTicTacToe.createArray(3);
        myTicTacToe.fieldInitialization(myField);

        int myPlayer = 0; // Нулевой игрок
        myTicTacToe.isWinPositionForDiagonals(myField, myPlayer); // Во всех элементах -1 после инициализации
        myTicTacToeTest.totalBooleanTest(false, myTicTacToe.isWinPositionForDiagonals(myField, myPlayer), "Null");

        myField[0][0] = 0;
        myField[1][1] = 0;
        myField[2][2] = 0;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForDiagonals(myField, myPlayer), "One");

        myTicTacToe.fieldInitialization(myField);
        myField[0][2] = 0;
        myField[1][1] = 0;
        myField[2][0] = 0;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForDiagonals(myField, myPlayer), "Two with 0");

        myTicTacToe.fieldInitialization(myField);
        myField[0][2] = 1;
        myField[1][1] = 1;
        myField[2][0] = 1;
        myTicTacToeTest.totalBooleanTest(false, myTicTacToe.isWinPositionForDiagonals(myField, myPlayer), "Two with 1");

        myPlayer = myTicTacToe.playerChange(myPlayer);

        myTicTacToe.fieldInitialization(myField);
        myField[0][0] = 1;
        myField[1][1] = 1;
        myField[2][2] = 1;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForDiagonals(myField, myPlayer), "Three");

        myTicTacToe.fieldInitialization(myField);
        myField[0][2] = 1;
        myField[1][1] = 1;
        myField[2][0] = 1;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForDiagonals(myField, myPlayer), "Four with 1");

        myTicTacToe.fieldInitialization(myField);
        myField[0][2] = 0;
        myField[1][1] = 0;
        myField[2][0] = 0;
        myTicTacToeTest.totalBooleanTest(false, myTicTacToe.isWinPositionForDiagonals(myField, myPlayer), "Four with 1");

    }

    void totalBooleanTest(Boolean expectedValue, Boolean actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
