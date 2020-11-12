package student_aleksejs_ivanovs.homework.lesson_11.level_1;

/*Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.*/

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
class Task_2 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();
        List<Long> longList = new ArrayList<>();
    }

}
