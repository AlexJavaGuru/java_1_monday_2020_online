package student_alexander_shl.homework.lesson_4.level_4.tasks_11_12_13_14_15;

/*
task_11:

Создайте класс Calculator. В этом классе создайте методы
для сложения, вычитания, деления и умножения двух целых чисел.

Подсказка:

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // реализуйте по аналогии оставшиеся методы

}

task_13:

Добавьте в класс Calculator метод для определения
чётное число или не чётное.

Добавьте в класс CalculatorTest тесты для этого метода.

Подсказка:

class Calculator {

    public boolean isEven(int number) {
        // реализуйте этот метод:
        // return true - если число чётное (делится на 2 без остатка)
        // иначе return false
    }

}

task_14:

Добавьте в класс Calculator метод для определения
максимального из двух целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго
- второе число больше первого
- оба числа равны
Создайте по одному тесту на каждый из сценариев!


Подсказка:

class Calculator {

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        // реализуйте этот метод
    }

}

task_15:

обавьте в класс Calculator метод для определения
максимального из трёх целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго и третьего
- второе число больше первого и третьего
- третье число больше первого и второго
- первые два равны и больше третьего
- ...
- три числа равны
По одному тесту на каждый из сценариев!

 */

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) { // Task 13
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) { // Task 14
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public boolean isEqual(int firstNumber, int secondNumber) {
        return firstNumber == secondNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) { // Task 15
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else {
            if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                return secondNumber;
            } else {
                return thirdNumber;
            }
        }
    }
}





