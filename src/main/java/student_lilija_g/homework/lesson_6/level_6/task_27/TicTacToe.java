package student_lilija_g.homework.lesson_6.level_6.task_27;
/*
В классе TicTacToe реализуйте метод:

public void play() {
    int[][] field = createField();
    while(true) {
        printFieldToConsole(field);
        Move move0 = getNextMove();
        field[move0.getX()][move0.getY()] = 0;
        printFieldToConsole(field);
        if (isWin(field, 0)) {
            System.out.println("Player 0 WIN!");
            break;
        }
        if (isDraw(field)) {
            System.out.println("DRAW!");
            break;
        }

        printFieldToConsole(field);
        Move move1 = getNextMove();
        field[move1.getX()][move1.getY()] = 1;
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

Создайте main метод и запустите игру крестики нолики:

public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.play();
}

Сыграйте в игру крестики нолики!
 */

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Ну разве это не круто? =) Поиграть в свою написанную игру? =) Только вот одна проблема...я смог походить на поле, которое было не пустое =D")
class TicTacToe {
    public int[][] createField() {

        int arrayLength = 3;
        int[][] field = new int[arrayLength][arrayLength];

        for (int horizontals = 0; horizontals < field.length; horizontals++) {
            for (int verticals = 0; verticals < field[0].length; verticals++) {
                field[horizontals][verticals] = -1;
            }
        }
        return field;
    }

    public boolean isWin(int[][] field, int playerToCheck) {

        for (int position = 0; position < field.length; position++)
            if ((field[position][0] == playerToCheck &&
                    field[position][1] == playerToCheck &&
                    field[position][2] == playerToCheck) ||

                    (field[0][position] == playerToCheck &&
                            field[1][position] == playerToCheck &&
                            field[2][position] == playerToCheck))
                return true;
        return (field[0][0] == playerToCheck && field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck) ||
                (field[2][0] == playerToCheck && field[1][1] == playerToCheck &&
                        field[0][2] == playerToCheck);
    }

    public boolean isDraw(int[][] field) {
        for (int[] ints : field) {
            for (int verticals = 0; verticals < field[0].length; verticals++) {
                if (ints[verticals] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    void printFieldToConsole(int[][] field) {
        drawLine();
        for (int[] ints : field) {
            for (int verticals = 0; verticals < field[0].length; verticals++) {
                if (ints[verticals] == -1) {
                    System.out.print("| " + ints[verticals] + " ");
                } else {
                    System.out.print("|  " + ints[verticals] + " ");
                }
            }
            System.out.println("|");
            drawLine();
        }
        System.out.println();
    }

    void drawLine() {
        for (int horizontal = 0; horizontal <= 15; horizontal++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public Move getNextMove() {

        int x, y;

        Scanner myScanner = new Scanner(System.in);

        do {
            System.out.print("Please, enter X coordinate (1..3):");
            x = myScanner.nextInt() - 1;

            System.out.print("Please, enter Y coordinate (1..3):");
            y = myScanner.nextInt() - 1;

            return new Move(x, y);

        } while (notError(x, y));
    }

    boolean notError(int x, int y) {
        return x >= 0 && y >= 0 && x < 3 && y < 3;
    }

    public void play() {

        int[][] field = createField();
        while (true) {

            printFieldToConsole(field);

            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);

            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
            printFieldToConsole(field);

            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
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

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}

