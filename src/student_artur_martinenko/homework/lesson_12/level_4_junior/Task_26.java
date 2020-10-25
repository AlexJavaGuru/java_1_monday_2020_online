package student_artur_martinenko.homework.lesson_12.level_4_junior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Task_26
/*
Напишите программу, которая вылетает с StackOverflowError.

Подсказка: Вызовите метод в рекурсии (сам себя).

Память JVM не безгранична!
 */
class Task_26 {
    public static Map<Integer, List<String>> justAMap = new HashMap<>();

    public static void main(String[] args) {
        Task_26 victim = new Task_26();

        victim.infinityLoop();
        //это было быстрее чем OutOfMemoryError
        //1
        //Exception in thread "main" java.lang.StackOverflowError

    }

    public void infinityLoop() {
        int counter = 0;
        while (true) {
            justAMap.put(counter, newFilledList());
            ++counter;
            System.out.println(counter);
            infinityLoop();
        }
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
