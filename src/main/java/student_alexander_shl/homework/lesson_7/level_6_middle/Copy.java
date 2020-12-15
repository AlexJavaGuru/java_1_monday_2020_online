package student_alexander_shl.homework.lesson_7.level_6_middle;
/*
Task_13:
Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int numberFrom, int numberTo)

вернуть новый массив, который содержит только те числа,
которые больше или равны numberFrom и меньше или равны numberTo.
Размер выходного массива должен быть равен количеству элементов в нем.

Логику необходимо реализовать в отдельном классе Copy.

Написать тестовые сценарии для класса Copy в классе CopyTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

class Copy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {

        int[] range = new int[Math.abs(numberFrom - numberTo) + 1];
        for (int i = numberFrom, j = 0; i <= numberTo; i++, j++) {
            range[j] = in[i];
        }
        return range;
    }
}
