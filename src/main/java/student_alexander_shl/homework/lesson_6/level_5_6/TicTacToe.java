package student_alexander_shl.homework.lesson_6.level_5_6;

import java.util.Scanner;

/*
Task_19:
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

Task_20:
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

Task_21:
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

Task_22:
В классе TicTacToe реализуйте
метод для определения является ли данная позиция
победной для указанного игрока.

Подсказка: победной позиция является тогда, когда
позиция победна по горизонталям ИЛИ вертикалям ИЛИ диагоналям.

Метод должен иметь следующую сигнатуру:
public boolean isWinPosition(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если позиция победна для указанного игрока (int playerToCheck),
 - false иначе.

В классе TicTacToeTest написать тесты для разработанного метода.

Task_23:
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

Task_24:
В классе TicTacToe реализуйте метод:

public int[][] createField().

Метод должен создавать двумерный массив целых чисел
и вставлять в каждую ячейку массива -1 (признак пустой клетки).

В классе TicTacToeTest написать тесты для разработанного метода.

Task_25:
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

Task_26:
Создайте в классе TicTacToe метод:

public void printFieldToConsole(int[][] field) {
    // распечатайте поле на консоль в читаемом формате
}

Task_27:
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

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) { // Task_19

        for (int[] ints : field) {
            if (ints[0] == playerToCheck &&
                    ints[1] == playerToCheck &&
                    ints[2] == playerToCheck)
                return true;
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) { // Task_20

        for (int verticalPosition = 0; verticalPosition < field[0].length; verticalPosition++) {
            if (field[0][verticalPosition] == playerToCheck &&
                    field[1][verticalPosition] == playerToCheck &&
                    field[2][verticalPosition] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) { // Task_21

        return (field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck) ||

                (field[0][2] == playerToCheck &&
                        field[1][1] == playerToCheck &&
                        field[2][0] == playerToCheck);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {     // Task_22

        for (int position = 0; position < field.length; position++)
            if ((field[position][0] == playerToCheck &&
                    field[position][1] == playerToCheck &&
                    field[position][2] == playerToCheck) ||
                    (field[0][position] == playerToCheck &&
                            field[1][position] == playerToCheck &&
                            field[2][position] == playerToCheck))
                return true;
        return (field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck) ||
                (field[2][0] == playerToCheck &&
                        field[1][1] == playerToCheck &&
                        field[0][2] == playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {                       // Task_23
        for (int[] ints : field) {
            for (int verticalPosition = 0; verticalPosition < field.length; verticalPosition++) {
                if (ints[verticalPosition] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {                                      // Task_24
        int[][] field = new int[3][3];
        for (int horizontalPosition = 0; horizontalPosition < field.length; horizontalPosition++) {
            for (int verticalPosition = 0; verticalPosition < field[0].length; verticalPosition++) {
                field[horizontalPosition][verticalPosition] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {                                          // Task_25
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X coordinate (1, 2, 3): ");
        int x = scanner.nextInt() - 1;
        System.out.print("Enter Y coordinate (1, 2, 3): ");
        int y = scanner.nextInt() - 1;
        return new Move(x, y);
    }

    public boolean isEmpty(int[][] field, int x, int y) {
        return field[x][y] == -1;
    }

    public void printFieldToConsole(int[][] field) {                   // Task_26
        int i = 1;
        System.out.print(" XY    1    2    3");
        System.out.print("\n    ----------------");
        System.out.println();
        for (int[] ints : field) {
            System.out.print("  " + i + " ");
            for (int verticalPosition = 0; verticalPosition < field[0].length; verticalPosition++) {
                if (ints[verticalPosition] == -1) {
                    System.out.print("| " + ints[verticalPosition] + " ");
                } else {
                    System.out.print("|  " + ints[verticalPosition] + " ");
                }
            }
            System.out.println("|");
            System.out.print("    ----------------\n");
            i++;
        }
        System.out.println();
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            System.out.println("PLAYER 0:");
            Move move0 = getNextMove();
            if (isEmpty(field, move0.getX(), move0.getY())) {
                field[move0.getX()][move0.getY()] = 0;
            } else {
                System.out.println("The indicated is full, You miss a turn!"); // при ходе в занятую клетку - переход хода.
            }
//          printFieldToConsole(field); в задании эта строка есть, но лучше без неё
            if (isWinPosition(field, 0)) {
                printFieldToConsole(field);
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                printFieldToConsole(field);
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            System.out.println("PLAYER 1:");
            Move move1 = getNextMove();
            if (isEmpty(field, move1.getX(), move1.getY())) {
                field[move1.getX()][move1.getY()] = 1;
            } else {
                System.out.println("The indicated cell is full, You miss a turn!"); // при ходе в занятую клетку - переход хода.
            }
//            printFieldToConsole(field); в задании эта строка есть, но лучше без неё
            if (isWinPosition(field, 1)) {
                printFieldToConsole(field);
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
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
