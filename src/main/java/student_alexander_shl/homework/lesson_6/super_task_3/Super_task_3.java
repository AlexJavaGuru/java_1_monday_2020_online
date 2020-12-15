package student_alexander_shl.homework.lesson_6.super_task_3;

import java.util.Arrays;

/*
Что за алгоритм сортировки лежит в основе метода

java.util.Arrays.sort(arr);  ???

Найдите информацию про этот алгоритм сортировки,
попробуйте понять как он работает и какая у него
алгоритмическая сложность.

Подсказка: найдите на YouTube ролики демонстрирующие
работу этого алгоритма сортировки.
 */

class Super_task_3 {
    public static void main(String[] args) {
        int[] array = {6, 99, 87, 34, 21, 76, 56, 67, 64, 98};

        System.out.println(Arrays.toString(array));

        Arrays.sort(array, 2, 10);
        System.out.println("\nSorted from 2 to 10:");

        System.out.println(Arrays.toString(array));
    }
}

/*

В пакете "util" для работы с массивами и коллекциями предназначены классы Arrays
 и Collections соответственно. Как основной сервис, они предоставляют методы
 для сортировки и поиска. Для совместимости API Collections и API Arrays унифицированы.

 Основных алгоритмов используется три:
 - два алгоритма сортировки: быстрая сортировка, сортировка слиянием.
 - один алгоритм поиска: бинарный поиск.

 Пользователю предоставляются статические перегруженные методы sort и binarySearch.
 Разница заключается в том, что методы Arrays API принимают массивы примитивных и ссылочных
 типов, в то время как методы sort и binarySearch Collections API принимают только списки.

 */


