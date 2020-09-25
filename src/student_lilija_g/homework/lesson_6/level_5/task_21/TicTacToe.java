package student_lilija_g.homework.lesson_6.level_5.task_21;

import teacher.annotations.CodeReview;

/*
В классе TicTacToe реализуйте
метод для определения является ли данная позиция
победной по диагоналям для указанного игрока.

Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если в одной из диагоналей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck),
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

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        return (field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck) ||

               (field[0][2] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][0] == playerToCheck);
    }

}
