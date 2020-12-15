package student_alexander_shl.homework.lesson_6.level_5_6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @Before
    public void init() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void checkTicTacToeIsWinPositionForHorizontals() { // Task_19
        int[][] fieldOne = {{0, 0, 0},
                {-1, 0, 1},
                {-1, 1, -1}};
        Assert.assertTrue(ticTacToe.isWinPositionForHorizontals(fieldOne, 0));

        int[][] fieldTwo = {{-1, 0, 1},
                {1, 1, 1},
                {-1, 1, -1}};
        Assert.assertTrue(ticTacToe.isWinPositionForHorizontals(fieldTwo, 1));
    }

    @Test
    public void checkTicTacToeIsWinPositionForVerticals() { // Task_20
        int[][] fieldOne = {{0, 1, -1},
                {0, -1, 1},
                {0, -1, -1}};
        Assert.assertTrue(ticTacToe.isWinPositionForVerticals(fieldOne, 0));

        int[][] fieldTwo = {{0, 0, 1},
                {-1, -1, 1},
                {0, -1, 1}};
        Assert.assertTrue(ticTacToe.isWinPositionForVerticals(fieldTwo, 1));
    }

    @Test
    public void checkTicTacToeIsWinPositionForDiagonals() { // Task_21
        int[][] fieldOne = {{0, 1, -1},
                {-1, 0, 1},
                {-1, -1, 0}};
        Assert.assertTrue(ticTacToe.isWinPositionForDiagonals(fieldOne, 0));

        int[][] fieldTwo = {{0, -1, 1},
                {0, 1, -1},
                {1, -1, 0}};
        Assert.assertTrue(ticTacToe.isWinPositionForDiagonals(fieldTwo, 1));
    }

    @Test
    public void checkTicTacToeIsWinPosition() { // Task_22
        int[][] fieldOne = {{0, 1, -1},
                {-1, 0, 1},
                {-1, -1, 0}};
        Assert.assertTrue(ticTacToe.isWinPosition(fieldOne, 0));

        int[][] fieldTwo = {{0, -1, 1},
                {0, 1, -1},
                {1, -1, 0}};
        Assert.assertTrue(ticTacToe.isWinPosition(fieldTwo, 1));
    }

    @Test
    public void checkTicTacToeIsDrawPosition() { // Task_23
        int[][] fieldOne = {{1, 0, 1},
                {0, 0, 1},
                {0, 1, 0}};
        Assert.assertTrue(ticTacToe.isDrawPosition(fieldOne));

        int[][] fieldTwo = {{0, -1, 1},
                {0, 1, -1},
                {1, -1, 0}};
        Assert.assertFalse(ticTacToe.isDrawPosition(fieldTwo));
    }

    @Test
    public void checkTicTacToeCreateField() {     // Task_24
        int[][] createField = ticTacToe.createField();
        int[][] blankArray = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        Assert.assertTrue(Arrays.deepEquals(createField, blankArray));
    }
}
