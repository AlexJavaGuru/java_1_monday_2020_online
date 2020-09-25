package student_lilija_g.homework.lesson_6.level_5.task_23;

import teacher.annotations.CodeReview;

/*
В классе TicTacToe реализуйте
метод для определения является ли данная позиция ничейной.

Подсказка: ничейной позиция является тогда, когда
позиция не победна ни для одного из игроков и нет ни
одной пустой клетки (клетки в которой стоит -1).

Метод должен иметь следующую сигнатуру:
public boolean isDrawPosition(int[][] field).

Поле передаётся в этот метод как первый параметр int[][] field.

Метод должет вернуть:
 - true если позиция ничейна,
 - false иначе.

В классе TicTacToeTest написать тесты для разработанного метода.
 */
@CodeReview(approved = true)
class TicTacToe {

    public int[][] createArray(int arrayLength) {
        return new int[arrayLength][arrayLength];
    }

    public void fieldInitialization(int[][] field) {

        for (int horizontals = 0; horizontals < field.length; horizontals++) {
            for (int verticals = 0; verticals < field[0].length; verticals++) {
                field[horizontals][verticals] = -1;
            }
        }
    }

    public int playerChange(int playerToCheck) {
        if (playerToCheck == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean isWin(int[][] field, int playerToCheck) {

        for (int position = 0; position < field.length; position++)
            if ((field[position][0] == playerToCheck &&
                    field[position][1] == playerToCheck &&
                    field[position][2] == playerToCheck) ||

                    (field[0][position] == playerToCheck &&
                            field[1][position] == playerToCheck &&
                            field[2][position] == playerToCheck))
                return false;
        return (field[0][0] != playerToCheck || field[1][1] != playerToCheck ||
                field[2][2] != playerToCheck) &&
                (field[2][0] != playerToCheck || field[1][1] != playerToCheck ||
                        field[0][2] != playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        for (int[] ints : field) {
            for (int verticals = 0; verticals < field[0].length; verticals++) {
                if (ints[verticals] == -1) {
                    return true;
                }
            }
        }
        return false;
    }
}
