package student_pjotrs_grezmanis.lesson_6.level_5;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest toeTest = new TicTacToeTest();
        toeTest.testTicTacToeHorizontalsFieldOne();//Task_19
        toeTest.testTicTacToeHorizontalsFieldTwo();//Task_19
        toeTest.testTicTacToeHorizontalsFieldThree();//Task_19
        toeTest.testTicTacToeHorizontalsFieldFour();//Task_19
        toeTest.TicTacToeTestVerticalsFieldOne();//Task_20
        toeTest.TicTacToeTestVerticalsFieldTwo();//Task_20
        toeTest.TicTacToeTestVerticalsFieldThree();//Task_20
        toeTest.TicTacToeTestVerticalsFieldFour();//Task_20
        toeTest.TicTacToeTestDiagonalsFieldOne();//Task_21
        toeTest.TicTacToeTestDiagonalsFieldTwo();//Task_21
        toeTest.TicTacToeTestIsWinPositionFirstPlayerOne();//Task_22
        toeTest.TicTacToeTestIsWinPositionFirstPlayerTwo();//Task_22
        toeTest.TicTacToeTestIsWinPositionFirstPlayerThree();//Task_22
        toeTest.TicTacToeTestIsWinPositionFirstPlayerFour();//Task_22
        toeTest.TicTacToeTestIsWinPositionSecondPlayerOne();//Task_22
        toeTest.TicTacToeTestIsDrawPositionOne();//Task_23

    }

    public void testTicTacToeHorizontalsFieldOne() {
        int[][] field = {{-1, 0, 1},
                {-1, -1, -1},
                {1, 1, 1}};
        if (TicTacToe.isWinPositionForHorizontals(field, 0) == true) {
            System.out.println("testTicTacToeField() - FAILED");
        } else {
            System.out.println("testTicTacToeField() - OK");
        }

    }

    public void testTicTacToeHorizontalsFieldTwo() {
        int[][] field = {{-1, 0, 1},
                {0, 0, 0},
                {-1, 1, -1}};
        if (TicTacToe.isWinPositionForHorizontals(field, 1) == true) {
            System.out.println("testTicTacToeField() - FAILED");
        } else {
            System.out.println("testTicTacToeField() - OK");
        }

    }

    public void testTicTacToeHorizontalsFieldThree() {
        int[][] field = {{-1, 0, 1},
                {-1, 0, -1},
                {1, 1, 1}};
        if (TicTacToe.isWinPositionForHorizontals(field, 1) == true) {
            System.out.println("testTicTacToeField() - OK ");
        } else {
            System.out.println("testTicTacToeField() - FAILED");
        }
    }

    public void testTicTacToeHorizontalsFieldFour() {
        int[][] field = {{0, 0, 0},
                {-1, 0, -1},
                {-1, 1, -1}};
        if (TicTacToe.isWinPositionForHorizontals(field, 0) == true) {
            System.out.println("testTicTacToeField() - OK ");
        } else {
            System.out.println("testTicTacToeField() - FAILED");
        }
    }

    public void TicTacToeTestVerticalsFieldOne() {
        int[][] field = {{-1, 0, 0},
                {-1, 0, 0},
                {-1, 1, 0}};
        if (TicTacToe.isWinPositionForVerticals(field, 0) == true) {
            System.out.println("testTicTacToeField() - OK ");
        } else {
            System.out.println("testTicTacToeField() - FAILED");
        }
    }

    public void TicTacToeTestVerticalsFieldTwo() {
        int[][] field = {{0, 1, -1},
                {-1, 1, 1},
                {-1, 1, 0}};
        if (TicTacToe.isWinPositionForVerticals(field, 1) == true) {
            System.out.println("testTicTacToeField() - OK ");
        } else {
            System.out.println("testTicTacToeField() - FAILED");
        }
    }

    public void TicTacToeTestVerticalsFieldThree() {
        int[][] field = {{0, 0, -1},
                {-1, 1, 0},
                {-1, 0, -1}};
        if (TicTacToe.isWinPositionForVerticals(field, 0) == true) {
            System.out.println("testTicTacToeFieldVerticals() - FAILED ");
        } else {
            System.out.println("testTicTacToeFieldVerticals() - OK");
        }
    }

    public void TicTacToeTestVerticalsFieldFour() {
        int[][] field = {{0, 1, 0},
                {-1, -1, 0},
                {-1, 1, -1}};
        if (TicTacToe.isWinPositionForVerticals(field, 1) == true) {
            System.out.println("testTicTacToeFieldVerticals() - FAILED ");
        } else {
            System.out.println("testTicTacToeFieldVerticals() - OK");
        }
    }

    public void TicTacToeTestDiagonalsFieldOne() {
        int[][] field = {{0, 1, 0},
                {-1, 0, 0},
                {0, 1, 0}};
        if (TicTacToe.isWinPositionForDiagonals(field, 0) == true) {
            System.out.println("testTicTacToeFieldDiagonals() - OK ");
        } else {
            System.out.println("testTicTacToeFieldDiagonals() - FAILED");
        }
    }

    public void TicTacToeTestDiagonalsFieldTwo() {
        int[][] field = {{1, -1, 0},
                {-1, 1, 0},
                {0, -1, 1}};
        if (TicTacToe.isWinPositionForDiagonals(field, 1) == true) {
            System.out.println("testTicTacToeFieldDiagonals() - OK ");
        } else {
            System.out.println("testTicTacToeFieldDiagonals() - FAILED");
        }
    }

    public void TicTacToeTestIsWinPositionFirstPlayerOne() {
        int[][] field = {{1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}};
        if (TicTacToe.isWinPosition(field, 1) == true) {
            System.out.println("testTicTacToeIsWinPositionFirstPlayer() - OK ");
        } else {
            System.out.println("testTicTacToeIsWinPositionFirstPlayer() - FAILED");
        }
    }

    public void TicTacToeTestIsWinPositionFirstPlayerTwo() {
        int[][] field = {{0, 0, 0},
                {1, 1, 1},
                {0, 0, 0}};
        if (TicTacToe.isWinPosition(field, 1) == true) {
            System.out.println("testTicTacToeIsWinPositionFirstPlayer() - OK ");
        } else {
            System.out.println("testTicTacToeIsWinPositionFirstPlayer() - FAILED");
        }
    }

    public void TicTacToeTestIsWinPositionFirstPlayerThree() {
        int[][] field = {{0, 0, 1},
                {0, 0, 1},
                {0, 0, 1}};
        if (TicTacToe.isWinPosition(field, 1) == true) {
            System.out.println("testTicTacToeIsWinPositionFirstPlayer() - OK ");
        } else {
            System.out.println("testTicTacToeIsWinPositionFirstPlayer() - FAILED");
        }
    }

    public void TicTacToeTestIsWinPositionFirstPlayerFour() {
        int[][] field = {{0, 1, 0},
                {1, 0, 1},
                {0, 0, 1}};
        if (TicTacToe.isWinPosition(field, 1) == true) {
            System.out.println("testTicTacToeIsWinPositionFirstPlayer() - FAILED ");
        } else {
            System.out.println("testTicTacToeIsWinPositionFirstPlayer() - OK");
        }
    }


    public void TicTacToeTestIsWinPositionSecondPlayerOne() {
        int[][] field = {{1, 1, 0},
                {1, 0, 1},
                {0, 1, 1}};
        if (TicTacToe.isWinPosition(field, 0) == true) {
            System.out.println("testTicTacToeIsWinPositionSecondPlayer() - OK ");
        } else {
            System.out.println("testTicTacToeIsWinPositionSecondPlayer() - FAILED");
        }
    }

    public void TicTacToeTestIsDrawPositionOne(){
        int[][] field = {{1, 1, 0},
                {0, 0, 1},
                {1, 1, -1}};
        if (TicTacToe.isDrawPosition(field) == false) {
            System.out.println("testTicTacToeIsWinPositionSecondPlayer() - OK");
        } else {
            System.out.println("testTicTacToeIsWinPositionSecondPlayer() - FAILED");
        }
    }
}