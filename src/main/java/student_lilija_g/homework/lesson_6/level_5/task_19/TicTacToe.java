package student_lilija_g.homework.lesson_6.level_5.task_19;

import teacher.annotations.CodeReview;

/*
Дано поле игры крестики нолики размерностью три на три клетки.
Поле представлено двумерным массивом целых чисел, где:
-1 - это пустая клетка,
0 - это клетка в которую сделал ход первый игрок,
1 - это клетка в которую сделал ход второй игрок.

Создайте класс TicTacToe и в этом классе реализуйте
метод для определения является ли данная позиция
победной по горизонталям для указанного игрока.

Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если в одной из горизонталей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck),
 - false иначе.

Создать класс TicTacToeTest
и написать тесты для разработанного метода.
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

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        for (int[] ints : field) {
            if (ints[0] == playerToCheck &&
                    ints[1] == playerToCheck &&
                    ints[2] == playerToCheck)
                return true;
        }
        return false;
    }

}



