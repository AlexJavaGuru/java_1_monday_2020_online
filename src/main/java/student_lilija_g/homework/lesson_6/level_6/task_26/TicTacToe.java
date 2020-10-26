package student_lilija_g.homework.lesson_6.level_6.task_26;

import teacher.annotations.CodeReview;

/*
Создайте в классе TicTacToe метод:

public void printFieldToConsole(int[][] field) {
    // распечатайте поле на консоль в читаемом формате
}
 */
@CodeReview(approved = true)
class TicTacToe {

    int[][] createField() {

        int arrayLength = 3;
        int[][] field = new int[arrayLength][arrayLength];

        for (int horizontals = 0; horizontals < field.length; horizontals++) {
            for (int verticals = 0; verticals < field[0].length; verticals++) {
                field[horizontals][verticals] = -1;
            }
        }
        return field;
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

    public static void main(String[] args) {
        TicTacToe myTicTacToe = new TicTacToe();
        int[][] myField = myTicTacToe.createField();
        myTicTacToe.printFieldToConsole(myField);

        myField[0][0] = 1;
        myField[0][1] = 0;
        myField[0][2] = 1;

        myField[1][0] = 1;
        myField[1][1] = 1;
        myField[1][2] = 0;

        myField[2][0] = 0;
        myField[2][1] = 1;
        myField[2][2] = 0;
        myTicTacToe.printFieldToConsole(myField);
    }
}


