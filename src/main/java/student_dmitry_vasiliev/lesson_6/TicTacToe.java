package student_dmitry_vasiliev.lesson_6;

/* - Task-19
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
- Task-20
        Метод должен иметь следующую сигнатуру:
        public boolean isWinPositionForVerticals(int[][] field, int playerToCheck).
- Task-21
        Метод должен иметь следующую сигнатуру:
        public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck).
- Task-22
        Метод должен иметь следующую сигнатуру:
        public boolean isWinPosition(int[][] field, int playerToCheck).
- Task-23
        Метод должен иметь следующую сигнатуру:
        public boolean isDrawPosition(int[][] field).*/
public class TicTacToe {

    public int[][] fillArrayNobody(int arrayDimension) {
        int[][] gameArray = new int[arrayDimension][arrayDimension];
        for (int row = 0; row < gameArray.length; row++) {
            for (int column = 0; column < gameArray.length; column++) {
                gameArray[row][column] = -1;
            }
        }
        return gameArray;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        for (int[] ints : field)
            if (ints[0] == playerToCheck &&
                    ints[1] == playerToCheck &&
                    ints[2] == playerToCheck) {
                return true;
            }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        for (int j = 0; j < field.length; j++)
            if (field[0][j] == playerToCheck &&
                    field[1][j] == playerToCheck &&
                    field[2][j] == playerToCheck) {
                return true;
            }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        for (int i = 0; i < field.length; i++)

            if ((field[0][0] == playerToCheck &&
                    field[1][1] == playerToCheck &&
                    field[2][2] == playerToCheck) ||

                    (field[0][2] == playerToCheck &&
                            field[1][1] == playerToCheck &&
                            field[2][0] == playerToCheck)) {
                return true;
            }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        TicTacToe game = new TicTacToe();

        return game.isWinPositionForDiagonals(field, playerToCheck) ||
                game.isWinPositionForHorizontals(field, playerToCheck) ||
                game.isWinPositionForVerticals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        TicTacToe game = new TicTacToe();

        return !game.isWinPositionForDiagonals(field, 0) &&
                !game.isWinPositionForDiagonals(field, 1) &&
                !game.isWinPositionForHorizontals(field, 0) &&
                !game.isWinPositionForHorizontals(field, 1) &&
                !game.isWinPositionForVerticals(field, 0) &&
                !game.isWinPositionForVerticals(field, 1);
    }
}

