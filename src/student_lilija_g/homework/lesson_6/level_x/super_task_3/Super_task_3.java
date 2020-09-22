package student_lilija_g.homework.lesson_6.level_x.super_task_3;

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
public class Super_task_3 {

    public static void main(String[] args) {
        int[] myArray = {-8, 7, 5, 9, 10, -2, 3};   // 1=7, 2=5, 3=9 => 5,7,9
        for (int j : myArray) {
            System.out.println("Number = " + j);
        }
        Arrays.sort(myArray,1,3);
        System.out.println("My array with some sorted values(1 to 3) is:");

        for (int j : myArray) {
            System.out.println("Number = " + j);
        }
    }
}
/*
Описание метода java.util.Arrays.sort:

Arrays.sort(myArray, int fromIndex, int toIndex)

Сортирует диапазон указанного массива объектов в порядке возрастания
в соответствии с естественным порядком его элементов.
Диапазон сортировки - от индекса fromIndex до индекса toIndex включительно.
 */