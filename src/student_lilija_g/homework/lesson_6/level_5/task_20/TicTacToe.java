package student_lilija_g.homework.lesson_6.level_5.task_20;
/*
В классе TicTacToe реализуйте
метод для определения является ли данная позиция
победной по вертикалям для указанного игрока.

Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForVerticals(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если в одной из вертикалей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck),
 - false иначе.

В классе TicTacToeTest написать тесты для разработанного метода.
 */
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

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        for (int verticals = 0; verticals < field[0].length; verticals++) {
            if (field[0][verticals] == playerToCheck &&
                    field[1][verticals] == playerToCheck &&
                    field[2][verticals] == playerToCheck) {
                return true;
            }
        }
        return false;
    }
}
