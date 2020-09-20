package student_lilija_g.homework.lesson_6.level_5.task_20;

class TicTacToeTest {
    public static void main(String[] args) {

        TicTacToe myTicTacToe = new TicTacToe();
        TicTacToeTest myTicTacToeTest = new TicTacToeTest();

        int[][] myField = myTicTacToe.createArray(3);
        myTicTacToe.fieldInitialization(myField);

        int myPlayer = 0; // Нулевой игрок
        myTicTacToe.isWinPositionForVerticals(myField, myPlayer); // Во всех элементах -1 после инициализации
        myTicTacToeTest.totalBooleanTest(false, myTicTacToe.isWinPositionForVerticals(myField, myPlayer), "Null");

        myField[0][0] = 0;
        myField[1][0] = 0;
        myField[2][0] = 0;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForVerticals(myField, myPlayer), "One");

        myTicTacToe.fieldInitialization(myField);
        myField[0][1] = 0;
        myField[1][1] = 0;
        myField[2][1] = 0;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForVerticals(myField, myPlayer), "Two");

        myTicTacToe.fieldInitialization(myField);
        myField[0][2] = 0;
        myField[1][2] = 0;
        myField[2][2] = 0;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForVerticals(myField, myPlayer), "Three with 0");

        myTicTacToe.fieldInitialization(myField);
        myField[0][2] = 1;
        myField[1][2] = 1;
        myField[2][2] = 1;
        myTicTacToeTest.totalBooleanTest(false, myTicTacToe.isWinPositionForVerticals(myField, myPlayer), "Three with 1");

        myPlayer = myTicTacToe.playerChange(myPlayer); // меняем на другого игрока

        myTicTacToe.fieldInitialization(myField);
        myField[0][0] = 1;
        myField[1][0] = 1;
        myField[2][0] = 1;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForVerticals(myField, myPlayer), "Four");

        myTicTacToe.fieldInitialization(myField);
        myField[0][1] = 1;
        myField[1][1] = 1;
        myField[2][1] = 1;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForVerticals(myField, myPlayer), "Five");

        myTicTacToe.fieldInitialization(myField);
        myField[0][2] = 1;
        myField[1][2] = 1;
        myField[2][2] = 1;
        myTicTacToeTest.totalBooleanTest(true, myTicTacToe.isWinPositionForVerticals(myField, myPlayer), "Six with 1");

        myTicTacToe.fieldInitialization(myField);
        myField[0][2] = 0;
        myField[1][2] = 0;
        myField[2][2] = 0;
        myTicTacToeTest.totalBooleanTest(false, myTicTacToe.isWinPositionForVerticals(myField, myPlayer), "Six with 0");

    }

        void totalBooleanTest(Boolean expectedValue, Boolean actualValue, String testName) {

            if (expectedValue == actualValue) {
                System.out.println(testName + " test = OK");
            } else {
                System.out.println(testName + " test = FAIL");
            }
        }
    }

