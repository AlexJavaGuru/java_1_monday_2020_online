package student_artur_martinenko.homework.lesson_11.level_1_intern;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.
 */
@CodeReview(approved = true)
class Task_2 {
    public static void main(String[] args) {
        //примитивные типы хранить не может. Использует обертку (Wrapper) для этого.
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();
        List<Long> longList = new ArrayList<>();
    }
}
