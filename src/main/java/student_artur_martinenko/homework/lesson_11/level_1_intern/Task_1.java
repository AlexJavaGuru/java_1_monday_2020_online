package student_artur_martinenko.homework.lesson_11.level_1_intern;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
Какие реализации интерфейса java.util.List вы знаете?
Напишите программу, которая демонстрирует создание разных списков.
PS: чем они отличаются друг от друга?
 */
@CodeReview(approved = true)
class Task_1 {
    public static void main(String[] args) {
        //содается определенным размером и потом увеличивается (1/2) путем копирования в новый увеличенный массив
        List<Integer> arrayList = new ArrayList<>();

        //в памяти не по порядку, имеют референции на предыдущие и следующие ноды. Стабильнее,но медленнее чем ArrayList.
        List<Integer> linkedList = new LinkedList<>();

        //содается определенным размером и потом увеличивается (1:1) путем копирования в новый увеличенный массив,
        //медленный из-за использования одной нити (single thread)
        List<Integer> vectorList = new Vector<>();
    }
}
