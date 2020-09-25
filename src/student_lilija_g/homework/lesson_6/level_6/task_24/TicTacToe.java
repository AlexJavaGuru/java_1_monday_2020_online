package student_lilija_g.homework.lesson_6.level_6.task_24;

import teacher.annotations.CodeReview;

/*
В классе TicTacToe реализуйте метод:

public int[][] createField().

Метод должен создавать двумерный массив целых чисел
и вставлять в каждую ячейку массива -1 (признак пустой клетки).

В классе TicTacToeTest написать тесты для разработанного метода.
 */
@CodeReview(approved = true)
class TicTacToe {

    public int[][] createField() { // Переименовала с предыдущих задач createArray -> createField, без передаваемого параметра
                                   // Плюс метод инициализации
        int arrayLength =3;
        int[][] field = new int[arrayLength][arrayLength];

        for (int horizontals = 0; horizontals < field.length; horizontals++) {
            for (int verticals = 0; verticals < field[0].length; verticals++) {
                field[horizontals][verticals] = -1;
            }
        }
        return field;
    }

    public int sumTwoDimensionalArrayNumbers(int[][] field) { // Для теста
        int sumResult = 0;
        for (int[] ints : field) {
            for (int j = 0; j < field[0].length; j++) {
                sumResult = sumResult + ints[j];
            }
        }
        return sumResult;
    }
}
