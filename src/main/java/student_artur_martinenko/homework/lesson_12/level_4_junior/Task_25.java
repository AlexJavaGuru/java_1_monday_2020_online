package student_artur_martinenko.homework.lesson_12.level_4_junior;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Task_25
/*
Напишите программу, которая вылетает с OutOfMemoryError.

Подсказка: создайте много объектов, только не теряйте ссылки на них.
Например положите много объектов в список.

Память JVM не безгранична!
 */
@CodeReview(approved = true)
class Task_25 {
    public static void main(String[] args) {
        Task_25 victim = new Task_25();
        Map<Integer, List<String>> justAMap = new HashMap<>();

        int counter = 0;
        while (true) {
            justAMap.put(counter, victim.newFilledList());
            ++counter;
            System.out.println(counter);
        }
        //Вылетело на:
        //31333731
        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }

    public List<String> newFilledList() {
        List<String> list = new ArrayList<>();
        fillList(list);
        return list;
    }

    public List<String> fillList(List<String> list) {
        list.add("test,test,test,test,test,test,test,test,test,test");
        list.add("test,test,test,test,test,test,test,test,test,test");
        list.add("test,test,test,test,test,test,test,test,test,test");
        list.add("test,test,test,test,test,test,test,test,test,test");
        return list;
    }

}
