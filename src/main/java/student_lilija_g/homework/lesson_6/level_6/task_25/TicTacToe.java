package student_lilija_g.homework.lesson_6.level_6.task_25;

import java.util.Scanner;

/*
Создайте класс Move с двумя свойствами:

    private int x;
    private int y;

и конструктором, который принимает два целых числа
- координаты клетки в которую хочет походить игрок
и get методами для этих свойств.

В классе TicTacToe создайте метод:

public Move getNextMove() {
    // запросите у пользователя с консоли две координаты
    // клетки куда хочет походить игрок
    // создайте экземпляр класса Move и передайте ему
    // в конструктор введённые пользователем координаты
    // верните созданный объект Move из метода.
}

 */
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

    boolean notError(int x, int y) {
        return x >= 0 && y >= 0 && x < 3 && y < 3;
    }

    public Move getNextMove() {

        int x, y;
        Scanner myScanner = new Scanner(System.in);

        do {
            System.out.print("Please, enter X coordinate (1..3):");
            x = myScanner.nextInt() - 1;

            System.out.print("Please, enter Y coordinate (1..3):");
            y = myScanner.nextInt() - 1;

        } while (notError(x, y));
        return new Move(x, y);
     }

    public static void main(String[] args) {
        TicTacToe myTicTacToe = new TicTacToe();
        myTicTacToe.createField();
        myTicTacToe.getNextMove();

    }
}




