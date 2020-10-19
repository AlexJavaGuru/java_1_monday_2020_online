package student_pjotrs_grezmanis.lesson_7.level_6;
/*Разработать класс с методом, который копирует числа в заданном диапазоне
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

    public int[] copyInRange(int[] array, int numberFrom, int numberTo) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= numberFrom && array[i] <= numberTo) {
                count++;
            }
        }
        int[] finalArray = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= numberFrom && array[i] <= numberTo) {
                finalArray[index] = array[i];
                index++;
            }
        }
        return finalArray;
    }
}





