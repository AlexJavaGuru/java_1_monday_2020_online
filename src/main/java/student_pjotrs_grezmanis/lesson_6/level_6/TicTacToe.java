package student_pjotrs_grezmanis.lesson_6.level_6;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class TicTacToe {
    public static void main(String[] args) {
        TicTacToe tacToe = new TicTacToe();
        tacToe.play();
    }
    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getY()][move0.getX()] = 0;
            printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
            Move move1 = getNextMove();
            field[move1.getY()][move1.getX()] = 1;
            printFieldToConsole(field);
            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }
    public Move getNextMove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter coordinates X");
        int x = input.nextInt();
        System.out.println("Please enter coordinates Y");
        int y = input.nextInt();
        return new Move(x, y);
    }
    public void printFieldToConsole(int[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field.length; col++) {
                String prefix = field[row][col] == -1 ? "" : " ";
                System.out.print(prefix + field[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
    }
    public boolean isWin(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[i][0] == playerToCheck && field[i][1] == playerToCheck &&
                    field[i][2] == playerToCheck) ||
                    (field[0][i] == playerToCheck && field[1][i] == playerToCheck &&
                            field[2][i] == playerToCheck))
                return true;
            if ((field[0][0] == playerToCheck && field[1][1] == playerToCheck &&
                    field[2][2] == playerToCheck) ||
                    (field[2][0] == playerToCheck && field[1][1] == playerToCheck &&
                            field[0][2] == playerToCheck))
                return true;
        }
        return false;
    }
    public boolean isDraw(int[][] field) {
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field.length; j++)
                if (field[i][j] == -1)
                    return false;
        return true;
    }
}