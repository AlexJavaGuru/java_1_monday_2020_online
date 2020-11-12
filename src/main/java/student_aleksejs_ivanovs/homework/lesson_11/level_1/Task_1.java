package student_aleksejs_ivanovs.homework.lesson_11.level_1;

/*Какие реализации интерфейса java.util.List вы знаете?
Напишите программу, которая демонстрирует создание разных списков.
PS: чем они отличаются друг от друга?*/

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

@CodeReview(approved = true)
class Task_1 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        //At creation has a certain size and then grows (1 / 2) by copying to a new enlarged array

        List<Integer> linkedList = new LinkedList<>();
        //Stored in memory out of order, have references to the previous and next nodes. Stable, but slower than ArrayList.

        List<Integer> vectorList = new Vector<>();
        //Created with a certain size and, if necessary, increasing (1 : 1) copying into a new increased array,
        //slow due to using one thread.
    }

}
